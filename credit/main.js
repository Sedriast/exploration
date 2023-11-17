function handleSubmit(event = null) {
	event.preventDefault();
	const state = {
		interest: 0.015,
		decimals: 2,
		valuesForm: {
			'amount': parseFloat(event.target[0].value),
			'duration': parseFloat(event.target[1].value),
			'period': parseFloat(event.target[2].value),
			'labelPeriode': event.target[2].options[event.target[2].selectedIndex].text,
		},
	}
	const operations = {
		interestRateForPeriod: state.interest / state.valuesForm.period,
		paymentPeriode: state.valuesForm.period * state.valuesForm.duration,
		totalInterest: state.valuesForm.amount * (state.interest / state.valuesForm.period),
		costOperations: state.valuesForm.amount * ((((1 + (state.interest / state.valuesForm.period)) ** (state.valuesForm.period * state.valuesForm.duration)) * (state.interest / state.valuesForm.period)) / (((1 + (state.interest / state.valuesForm.period)) ** (state.valuesForm.period * state.valuesForm.duration)) - 1)),
	}
	const { matrixRE, matrixAM } = matrix(state, operations);
	createTables(matrixRE, matrixAM, titles().table_1.length, operations.paymentPeriode + 1);
}

function matrix(state = {}, operations = {}) {
	let amountRestant = state.valuesForm.amount;
	let totalInterest_ = operations.totalInterest;
	let amortizationMatrix = [];
	let resumeMatrix = [];
	for (let i = 1; i <= operations.paymentPeriode; i++) {
		let step = amountRestant * operations.interestRateForPeriod;
		amortizationMatrix[i] = [];
		amortizationMatrix[i][0] = i;
		amortizationMatrix[i][1] = (step).toFixed(state.decimals);
		amortizationMatrix[i][2] = (operations.costOperations - (step)).toFixed(state.decimals);
		amortizationMatrix[i][3] = amountRestant.toFixed(state.decimals);
		amountRestant -= operations.costOperations - (step);
		totalInterest_ += step;
	}
	amortizationMatrix[0] = titles().table_2;
	resumeMatrix[0] = titles(state.valuesForm.labelPeriode).table_1;
	resumeMatrix[1] = [
		`$ ${state.valuesForm.amount}`, // Credit amount
		`${state.valuesForm.duration} years`, // Credit duration
		`${state.interest * 100} %`, // Annual interest rate
		state.valuesForm.labelPeriode, // Type paid
		`$ ${operations.costOperations.toFixed(state.decimals)}`, // Payment (labelPeriode)
		`$ ${(totalInterest_ + state.valuesForm.amount).toFixed(state.decimals3)}`, // Total paid
		`$ ${totalInterest_.toFixed(state.decimals)}`, // Total Interest
		`${state.valuesForm.period * state.valuesForm.duration}`, // Number of periods
	];
	return { matrixRE: resumeMatrix, matrixAM: amortizationMatrix };
}

function createTables(dataTable1 = [], dataTable2 = [], numberColumnsTable1 = number, numberColumnsTable2 = number) {
	let table_1_access = document.getElementById("table_1");
	let table_2_access = document.getElementById("table_2");
	table_1_access.innerHTML = "";
	table_2_access.innerHTML = "";
	// Create table_1 (Resume)
	for (var i = 0; i < numberColumnsTable1; i++) {
		let rowConstructor = document.createElement("tr");
		for (var j = 0; j < 1; j++) {
			creatorTX(null, rowConstructor, "th", dataTable1[0][i], false);
			creatorTX(table_1_access, rowConstructor, "td", dataTable1[1][i], true);
		}
	}
	// Create table_2 (Amortization)
	for (var i = 0; i < numberColumnsTable2; i++) {
		let rowConstructor = document.createElement("tr");
		for (var j = 0; j < 4; j++) {
			creatorTX(table_2_access, rowConstructor, "td", dataTable2[i][j], true);
		}
	}
	table_1_access.classList.add("table_active");
	table_2_access.classList.add("table_active");
}

/* Here we create a <td> element and a text node, the text node is the content, located at the end of this*/
function creatorTX(access = null, rowConstructor = null, element = "td", text = "", create = false) {
	let cell = document.createElement(element);
	let cellText = document.createTextNode(text);
	cell.appendChild(cellText);
	rowConstructor.appendChild(cell);
	create && access.appendChild(rowConstructor);
}

function titles(periodLabel = "") {
	return {
		table_1: [
			"Credit amount ",
			"Credit duration ",
			"Annual interest rate ",
			"Type paid ",
			"Payment " + periodLabel,
			"Total paid ",
			"Total Interest ",
			"Number of periods "],
		table_2: [" Period ", " Interest paid ", " Capital paid ", " Remaining balance "],
	}
}