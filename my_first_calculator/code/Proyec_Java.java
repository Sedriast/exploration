package ll.proyec_java.ll;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.plaf.ColorUIResource;

public class Proyec_Java extends JFrame implements ActionListener, ChangeListener {
    
    private JButton b_,bbor,bbort,bigu,bpun,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bsu,bre,bdi,bmu,bsen,bcos,btan,brai,ba,bb,bc,bd,be,bf,bDO,bDH,bDB,bOD,bOH,bOB,bHD,bHO,bHB,bBD,bBO,bBH;
    private JTextField tfA,tfM,tfS;
    private JRadioButton rbD,rbO,rbH,rbB;
    private ButtonGroup bg;
    private UIManager ma;
    public static int trans,oct,cam=0,cam_=0;
    public static String Decimal,Octal,Hexadecimal,Binario;
    public static double n1,n2,r,R,R_,RR,n3,sin,cos,tan,rai,s;
    
    public Proyec_Java(){
        
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(112, 173, 223));
        setTitle("Proyec");
        
        ma = new UIManager();
        ma.put("OptionPane.background",new ColorUIResource(112, 173, 223));
        ma.put("Panel.background", new ColorUIResource(112, 173, 223));
        ma.put("Button.background", new Color(112, 173, 223));
        ma.put("Button.foreground", new Color(0,0,0));
        ma.put("Button.", "presione <enter>");
        ma.put("Button.border", new Color(0,0,0));
        
        b_ = new JButton("");
        b_.setVisible(true);
        b_.setBorder(null);
        b_.setBackground(new Color(112, 173, 223));
        b_.setBounds(1, 1,1, 1);
        b_.addActionListener(this);
        add(b_);
        
        tfA = new JTextField();
        tfA.setHorizontalAlignment(JTextField.RIGHT); 
        tfA.setBorder(null);
        tfA.setEditable(false);
        tfA.setBackground(new Color(152, 213, 255));
        tfA.setBounds(5, 5, 195, 18);
        tfA.setFont(new Font("arial", 0, 16));
        tfA.setForeground(new Color(0,0,0));
        tfA.setVisible(true);
        add(tfA);
        
        tfM = new JTextField();
        tfM.setBorder(null);
        tfM.setEditable(true);
        tfM.setBackground(new Color(152, 213, 255));
        tfM.setBounds(5, 22, 205, 25);
        tfM.setFont(new Font("arial", 0, 23));
        tfM.setForeground(new Color(0,0,0));
        tfM.setVisible(true);
        tfM.setEnabled(true);
        add(tfM);
        
        tfS = new JTextField();
        tfS.setBorder(null);
        tfS.setEditable(false);
        tfS.setBackground(new Color(152, 213, 255));
        tfS.setBounds(200, 5, 10, 18);
        tfS.setFont(new Font("arial", 1, 16));
        tfS.setForeground(new Color(0,0,0));
        tfS.setVisible(true);
        add(tfS);
        
        bbort = new JButton("<<");
        bbort.setVisible(true);
        bbort.setBorder(null);
        bbort.setBackground(new Color(69, 123, 173));
        bbort.setBounds(180, 48 ,30, 10);
        bbort.addActionListener(this);
        add(bbort);
        
        bbor = new JButton("CE");
        bbor.setVisible(true);
        bbor.setBorder(null);
        bbor.setBackground(new Color(92, 153, 203));
        bbor.setBounds(110, 225 ,30, 30);
        bbor.addActionListener(this);
        add(bbor);
        
        b1 = new JButton("1");
        b1.setVisible(true);
        b1.setBorder(null);
        b1.setBackground(new Color(92, 153, 203));
        b1.setBounds(5, 85 ,30, 30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("2");
        b2.setVisible(true);
        b2.setBorder(null);
        b2.setBackground(new Color(92, 153, 203));
        b2.setBounds(40, 85 ,30, 30);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("3");
        b3.setVisible(true);
        b3.setBorder(null);
        b3.setBackground(new Color(92, 153, 203));
        b3.setBounds(75, 85 ,30, 30);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("4");
        b4.setVisible(true);
        b4.setBorder(null);
        b4.setBackground(new Color(92, 153, 203));
        b4.setBounds(5, 120 ,30, 30);
        b4.addActionListener(this);
        add(b4);
        
        b5 = new JButton("5");
        b5.setVisible(true);
        b5.setBorder(null);
        b5.setBackground(new Color(92, 153, 203));
        b5.setBounds(40, 120 ,30, 30);
        b5.addActionListener(this);
        add(b5);
        
        b6 = new JButton("6");
        b6.setVisible(true);
        b6.setBorder(null);
        b6.setBackground(new Color(92, 153, 203));
        b6.setBounds(75, 120 ,30, 30);
        b6.addActionListener(this);
        add(b6);
        
        b7 = new JButton("7");
        b7.setVisible(true);
        b7.setBorder(null);
        b7.setBackground(new Color(92, 153, 203));
        b7.setBounds(5, 155 ,30, 30);
        b7.addActionListener(this);
        add(b7);
        
        b8 = new JButton("8");
        b8.setVisible(true);
        b8.setBorder(null);
        b8.setBackground(new Color(92, 153, 203));
        b8.setBounds(40, 155 ,30, 30);
        b8.addActionListener(this);
        add(b8);
        
        b9 = new JButton("9");
        b9.setVisible(true);
        b9.setBorder(null);
        b9.setBackground(new Color(92, 153, 203));
        b9.setBounds(75, 155 ,30, 30);
        b9.addActionListener(this);
        add(b9);
        
        b0 = new JButton("0");
        b0.setVisible(true);
        b0.setBorder(null);
        b0.setBackground(new Color(92, 153, 203));
        b0.setBounds(40, 190 ,30, 30);
        b0.addActionListener(this);
        add(b0);
        
        bigu = new JButton("=");
        bigu.setVisible(true);
        bigu.setBorder(null);
        bigu.setBackground(new Color(92, 153, 203));
        bigu.setBounds(75, 190 ,30, 30);
        bigu.addActionListener(this);
        add(bigu);
        
        bpun = new JButton(".");
        bpun.setVisible(true);
        bpun.setBorder(null);
        bpun.setBackground(new Color(92, 153, 203));
        bpun.setBounds(5, 190 ,30, 30);
        bpun.addActionListener(this);
        add(bpun);
        
        bg = new ButtonGroup();
        rbD = new JRadioButton ("Dec");
        rbD.setBounds(5,59,50,20);
        rbD.setFont(new Font("arial",0,10));
        rbD.setForeground(new Color(0,0,0));
        rbD.setBackground(new Color (112, 173, 223));
        rbD.addChangeListener(this);
        rbD.setVisible(true);
        rbD.setEnabled(true);
        add(rbD);
        bg.add(rbD);

        rbO = new JRadioButton ("Oct");
        rbO.setBounds(50, 59,50,20);
        rbO.setFont(new Font("arial",0,10));
        rbO.setForeground(new Color(0,0,0));
        rbO.setBackground(new Color (112, 173, 223));
        rbO.addChangeListener(this);
        rbO.setVisible(true);
        add(rbO);
        bg.add(rbO);

        rbH = new JRadioButton ("Hex");
        rbH.setBounds(100,59,50,20);
        rbH.setFont(new Font("arial",0,10));
        rbH.setForeground(new Color(0,0,0));
        rbH.setBackground(new Color (112, 173, 223));
        rbH.addChangeListener(this);
        rbH.setVisible(true);
        add(rbH);
        bg.add(rbH);

        rbB = new JRadioButton ("Bin");
        rbB.setBounds(150,59,50,20);   
        rbB.setFont(new Font("arial",0,10));
        rbB.setForeground(new Color(0,0,0));
        rbB.setBackground(new Color (112, 173, 223));
        rbB.addChangeListener(this);
        rbB.setVisible(true);
        add(rbB);
        bg.add(rbB);
        
        bsu = new JButton("+");
        bsu.setVisible(true);
        bsu.setBorder(null);
        bsu.setBackground(new Color(92, 153, 203));
        bsu.setBounds(110, 85 ,30, 30);
        bsu.addActionListener(this);
        add(bsu);
        
        bre = new JButton("-");
        bre.setVisible(true);
        bre.setBorder(null);
        bre.setBackground(new Color(92, 153, 203));
        bre.setBounds(110, 120 ,30, 30);
        bre.addActionListener(this);
        add(bre);
        
        bdi = new JButton("/");
        bdi.setVisible(true);
        bdi.setBorder(null);
        bdi.setBackground(new Color(92, 153, 203));
        bdi.setBounds(110, 155 ,30, 30);
        bdi.addActionListener(this);
        add(bdi);
        
        bmu = new JButton("*");
        bmu.setVisible(true);
        bmu.setBorder(null);
        bmu.setBackground(new Color(92, 153, 203));
        bmu.setBounds(110, 190 ,30, 30);
        bmu.addActionListener(this);
        add(bmu);
        
        bsen = new JButton("sin");
        bsen.setVisible(true);
        bsen.setBorder(null);
        bsen.setBackground(new Color(92, 153, 203));
        bsen.setBounds(145, 85 ,30, 30);
        bsen.addActionListener(this);
        add(bsen);
        
        bcos = new JButton("cos");
        bcos.setVisible(true);
        bcos.setBorder(null);
        bcos.setBackground(new Color(92, 153, 203));
        bcos.setBounds(145, 120 ,30, 30);
        bcos.addActionListener(this);
        add(bcos);
        
        btan = new JButton("tan");
        btan.setVisible(true);
        btan.setBorder(null);
        btan.setBackground(new Color(92, 153, 203));
        btan.setBounds(145, 155 ,30, 30);
        btan.addActionListener(this);
        add(btan);
        
        brai = new JButton("√");
        brai.setVisible(true);
        brai.setBorder(null);
        brai.setBackground(new Color(92, 153, 203));
        brai.setBounds(145, 190 ,30, 30);
        brai.addActionListener(this);
        add(brai);
        
        ba = new JButton("a");
        ba.setVisible(true);
        ba.setEnabled(false);
        ba.setBorder(null);
        ba.setBackground(new Color(92, 153, 203));
        ba.setBounds(180, 85 ,30, 30);
        ba.addActionListener(this);
        add(ba);
        
        bb = new JButton("b");
        bb.setVisible(true);
        bb.setEnabled(false);       
        bb.setBorder(null);
        bb.setBackground(new Color(92, 153, 203));
        bb.setBounds(180, 120 ,30, 30);
        bb.addActionListener(this);
        add(bb);
        
        bc = new JButton("c");
        bc.setVisible(true);
        bc.setEnabled(false);
        bc.setBorder(null);
        bc.setBackground(new Color(92, 153, 203));
        bc.setBounds(180, 155 ,30, 30);
        bc.addActionListener(this);
        add(bc);
        
        bd = new JButton("d");
        bd.setVisible(true);
        bd.setEnabled(false);
        bd.setBorder(null);
        bd.setBackground(new Color(92, 153, 203));
        bd.setBounds(180, 190 ,30, 30);
        bd.addActionListener(this);
        add(bd);
        
        be = new JButton("e");
        be.setVisible(true);
        be.setEnabled(false);
        be.setBorder(null);
        be.setBackground(new Color(92, 153, 203));
        be.setBounds(180, 225 ,30, 30);
        be.addActionListener(this);
        add(be);
        
        bf = new JButton("f");
        bf.setVisible(true);
        bf.setEnabled(false);
        bf.setBorder(null);
        bf.setBackground(new Color(92, 153, 203));
        bf.setBounds(145, 225 ,30, 30);
        bf.addActionListener(this);
        add(bf);
        
        bDO = new JButton("Oct");
        bDO.setVisible(false);
        bDO.setBorder(null);
        bDO.setBackground(new Color(92, 153, 203));
        bDO.setBounds(5, 225 ,30, 30);
        bDO.addActionListener(this);
        add(bDO);
        
        bDH = new JButton("Hex");
        bDH.setVisible(false);
        bDH.setBorder(null);
        bDH.setBackground(new Color(92, 153, 203));
        bDH.setBounds(40, 225 ,30, 30);
        bDH.addActionListener(this);
        add(bDH);
        
        bDB = new JButton("Bin");
        bDB.setVisible(false);
        bDB.setBorder(null);
        bDB.setBackground(new Color(92, 153, 203));
        bDB.setBounds(75, 225 ,30, 30);
        bDB.addActionListener(this);
        add(bDB);
        
        bOD = new JButton("Dec");
        bOD.setVisible(true);
        bOD.setBorder(null);
        bOD.setBackground(new Color(92, 153, 203));
        bOD.setBounds(5, 225 ,30, 30);
        bOD.addActionListener(this);
        add(bOD);
        
        bOH = new JButton("Hex");
        bOH.setVisible(true);
        bOH.setBorder(null);
        bOH.setBackground(new Color(92, 153, 203));
        bOH.setBounds(40, 225 ,30, 30);
        bOH.addActionListener(this);
        add(bOH);
        
        bOB = new JButton("Bin");
        bOB.setVisible(true);
        bOB.setBorder(null);
        bOB.setBackground(new Color(92, 153, 203));
        bOB.setBounds(75, 225 ,30, 30);
        bOB.addActionListener(this);
        add(bOB);
        
        bHD = new JButton("Dec");
        bHD.setVisible(true);
        bHD.setBorder(null);
        bHD.setBackground(new Color(92, 153, 203));
        bHD.setBounds(5, 225 ,30, 30);
        bHD.addActionListener(this);
        add(bHD);
        
        bHO = new JButton("Oct");
        bHO.setVisible(true);
        bHO.setBorder(null);
        bHO.setBackground(new Color(92, 153, 203));
        bHO.setBounds(40, 225 ,30, 30);
        bHO.addActionListener(this);
        add(bHO);
        
        bHB = new JButton("Bin");
        bHB.setVisible(true);
        bHB.setBorder(null);
        bHB.setBackground(new Color(92, 153, 203));
        bHB.setBounds(75, 225 ,30, 30);
        bHB.addActionListener(this);
        add(bHB);
        
        bBD = new JButton("Dec");
        bBD.setVisible(true);
        bBD.setBorder(null);
        bBD.setBackground(new Color(92, 153, 203));
        bBD.setBounds(5, 225 ,30, 30);
        bBD.addActionListener(this);
        add(bBD);
        
        bBO = new JButton("Oct");
        bBO.setVisible(true);
        bBO.setBorder(null);
        bBO.setBackground(new Color(92, 153, 203));
        bBO.setBounds(40, 225 ,30, 30);
        bBO.addActionListener(this);
        add(bBO);
        
        bBH = new JButton("Hex");
        bBH.setVisible(true);
        bBH.setBorder(null);
        bBH.setBackground(new Color(92, 153, 203));
        bBH.setBounds(75, 225 ,30, 30);
        bBH.addActionListener(this);
        add(bBH);   
    }
    
    public void actionPerformed(ActionEvent e){
             if(e.getSource() == bbort){
                    tfA.setText("");
                    tfS.setText("");
                    tfM.setText("");
                }
            if(e.getSource() == bbor){
                if(!(tfM.getText().equals(""))){
                    tfM.setText(acortar(tfM.getText(),1));
                } else {
                    tfA.setText("");
                    tfS.setText("");
                }
            }
            if(e.getSource() == b1){
                tfM.setText(tfM.getText()+"1");
            }
            if(e.getSource() == b2){
                tfM.setText(tfM.getText()+"2");
            }
            if(e.getSource() == b3){
                tfM.setText(tfM.getText()+"3");
            }
            if(e.getSource() == b4){
                tfM.setText(tfM.getText()+"4");
            }
            if(e.getSource() == b5){
                tfM.setText(tfM.getText()+"5");
            }
            if(e.getSource() == b6){
                tfM.setText(tfM.getText()+"6");
            }   
            if(e.getSource() == b7){
                tfM.setText(tfM.getText()+"7");
            }
            if(e.getSource() == b8){
                tfM.setText(tfM.getText()+"8");
            }
            if(e.getSource() == b9){
                tfM.setText(tfM.getText()+"9");
            }
            if(e.getSource() == b0){
                tfM.setText(tfM.getText()+"0");
            }
            if(e.getSource() == bpun){
                tfM.setText(tfM.getText()+".");
            }
            try{
            if(e.getSource() == bsu){
                cam_=1;
                if(tfS.getText().equals("")||tfS.getText().equals("+")){
                        switch(cam){
                            case 0:
                                n1=Double.parseDouble(tfM.getText());
                                R=n1;
                                tfA.setText(Double.toString(n1));
                                tfS.setText("+");
                                tfM.setText("");
                                cam=1;
                                break;
                            case 1:
                                n2=Double.parseDouble(tfM.getText());
                                r=n1+n2;
                                R=r;
                                n1=0;
                                n2=0;
                                tfA.setText(Double.toString(r));
                                tfS.setText("+");
                                tfM.setText("");
                                cam=2;
                                break;
                            case 2 :
                                n1=Double.parseDouble(tfM.getText());
                                n2=r+n1;
                                R=n2;
                                r=0;
                                n1=0;
                                tfA.setText(Double.toString(n2));
                                tfS.setText("+");
                                tfM.setText("");
                                cam=3;
                                break;
                            case 3:
                                n1=Double.parseDouble(tfM.getText());
                                r=n2+n1;
                                R=r;
                                n2=0;
                                n1=0;
                                tfA.setText(Double.toString(r));
                                tfS.setText("+");
                                tfM.setText("");
                                cam=2;
                                break;
                        }
                 } else {
                       tfS.setText("+");
                 }
            }
            if(e.getSource() == bre){
                cam_=2;
                if(tfS.getText().equals("")||tfS.getText().equals("-")){
                    switch(cam){
                        case 0:
                            n1=Double.parseDouble(tfM.getText());
                            R=n1;
                            tfA.setText(Double.toString(n1));
                            tfS.setText("-");
                            tfM.setText("");
                            cam=1;
                            break;
                       case 1:
                            n2=Double.parseDouble(tfM.getText());
                            r=n1-n2;
                            R=r;
                            n1=0;
                            n2=0;
                            tfA.setText(Double.toString(r));
                            tfS.setText("-");
                            tfM.setText("");
                            cam=2;
                            break;
                        case 2 :
                            n1=Double.parseDouble(tfM.getText());
                            n2=r-n1;
                            R=n2;
                            r=0;
                            n1=0;
                            tfA.setText(Double.toString(n2));
                            tfS.setText("-");
                            tfM.setText("");
                            cam=3;
                            break;
                        case 3:
                            n1=Double.parseDouble(tfM.getText());
                            r=n2-n1;
                            R=r;
                            n2=0;
                            n1=0;
                            tfA.setText(Double.toString(r));
                            tfS.setText("-");
                            tfM.setText("");
                            cam=2;
                            break;
                    }
                } else {
                    tfM.setText("-"+tfM.getText());
                }
            }
            if(e.getSource() == bdi){
                cam_=3;
                if(tfS.getText().equals("")||tfS.getText().equals("/")){
                    switch(cam){
                        case 0:
                            n1=Double.parseDouble(tfM.getText());
                            R=n1;
                            tfA.setText(Double.toString(n1));
                            tfS.setText("/");
                            tfM.setText("");
                            cam=1;
                            break;
                       case 1:
                            n2=Double.parseDouble(tfM.getText());
                            r=n1/n2;
                            R=r;
                            n1=0;
                            n2=0;
                            tfA.setText(Double.toString(r));
                            tfS.setText("/");
                            tfM.setText("");
                            cam=2;
                            break;
                        case 2 :
                            n1=Double.parseDouble(tfM.getText());
                            n2=r/n1;
                            R=n2;
                            r=0;
                            n1=0;
                            tfA.setText(Double.toString(n2));
                            tfS.setText("/");
                            tfM.setText("");
                            cam=3;
                            break;
                        case 3:
                            n1=Double.parseDouble(tfM.getText());
                            r=n2/n1;
                            R=r;
                            n2=0;
                            n1=0;
                            tfA.setText(Double.toString(r));
                            tfS.setText("/");
                            tfM.setText("");
                            cam=2;
                            break;
                        }
                    } else {
                    tfS.setText("/");
                }
            }
            if(e.getSource() == bmu){
                cam_=4;
                if(tfS.getText().equals("")||tfS.getText().equals("*")){
                     switch(cam){
                        case 0:
                            n1=Double.parseDouble(tfM.getText());
                            tfA.setText(Double.toString(n1));
                            tfS.setText("*");
                            tfM.setText("");
                            cam=1;
                            break;
                       case 1:
                            n2=Double.parseDouble(tfM.getText());
                            r=n1*n2;
                            n1=0;
                            n2=0;
                            tfA.setText(r+"*");
                            tfM.setText("");
                            cam=2;
                            break;
                        case 2 :
                            n1=Double.parseDouble(tfM.getText());
                            n2=r*n1;
                            r=0;
                            n1=0;
                            tfA.setText(n2+"*");
                            tfM.setText("");
                            cam=3;
                            break;
                        case 3:
                            n1=Double.parseDouble(tfM.getText());
                            r=n2*n1;
                            n2=0;
                            n1=0;
                            tfA.setText(r+"*");
                            tfM.setText("");
                            cam=2;
                            break;
                        }
                  } else {
                    tfS.setText("*");
                  }
            }
         }  catch (NumberFormatException en) {
                                        JOptionPane.showMessageDialog(null,"\nERROR: puede ser alguna de estas opciones:"
                            + "\n1) El dato ingresado no es valido(es una letra o simbolo)"
                            + "\n2) El resultado de la operacion es ineccistente o demaciado amplio."
                            + "\n3) Se utilico coma <<,>> en lugar de punto <<.>> (porfavor cambiar y reintentar)"
                                                + "\n   ",".",JOptionPane.WARNING_MESSAGE,null);        
        }  
      try{
            if(e.getSource() == bsen){
                s=Math.toRadians(Double.parseDouble(tfM.getText()));
                sin=Math.sin(s);
                tfM.setText(String.format("%.3f",sin));
            }
            if(e.getSource() == bcos){
                s=Math.toRadians(Double.parseDouble(tfM.getText()));
                cos=Math.cos(s);
                tfM.setText(String.format("%.3f",cos));
            }
            if(e.getSource() == btan){
                s=Math.toRadians(Double.parseDouble(tfM.getText()));
                tan=Math.tan(s);
                tfM.setText(String.format("%.3f",(tan)));
                }
            if(e.getSource() == brai){
                s=Double.parseDouble(tfM.getText());
                rai=Math.sqrt(s);
                tfM.setText(String.format("%.3f",rai));
            }   
        }  catch (NumberFormatException en) {
                    JOptionPane.showMessageDialog(null,"\nERROR: puede ser alguna de estas opciones:"
                            + "\n1) El dato ingresado no es valido(es una letra o simbolo)"
                            + "\n2) El resultado de la operacion es ineccistente o demaciado amplio."
                            + "\n3) Se utilico coma <<,>> en lugar de punto <<.>>  ",".",JOptionPane.WARNING_MESSAGE,null);      
           }  
            
            if(e.getSource() == ba){
                tfM.setText(tfM.getText()+"A");
            }
            if(e.getSource() == bb){
                tfM.setText(tfM.getText()+"B");
            }
            if(e.getSource() == bc){
                tfM.setText(tfM.getText()+"C");
            }
            if(e.getSource() == bd){
                tfM.setText(tfM.getText()+"D");
            }
            if(e.getSource() == be){
                tfM.setText(tfM.getText()+"E");
            }
            if(e.getSource() == bf){
                tfM.setText(tfM.getText()+"F");
            }
            try{ 
                if(e.getSource() == bDO){
                    Decimal = tfM.getText();
                    trans = Integer.parseInt(Decimal);    
                    Decimal_Octal sd1 = new Decimal_Octal();
                    if (trans < 0) {
                         JOptionPane.showMessageDialog(null,"Solo se permiten números positivos!!","Warning!",JOptionPane.WARNING_MESSAGE,null);
                } else {
                    this.setVisible(false);
                        JOptionPane.showMessageDialog(null,"\nEl  resultado en es: "+
                        "\n"+ sd1.o,"Decimal_Octal",JOptionPane.WARNING_MESSAGE, new ImageIcon("./data/ima1.png"));
                    this.setVisible(true);
                         sd1.o="";
               }
            }
            if(e.getSource() == bDH){
                    Decimal = tfM.getText();
                    trans = Integer.parseInt(Decimal);
                    Decimal_Hexadecimal sd2 = new Decimal_Hexadecimal();                        
                    
                    if (trans < 0) {
                         JOptionPane.showMessageDialog(null,"Solo se permiten números positivos!!","Warning!",JOptionPane.WARNING_MESSAGE,null);
                     } else{
                    this.setVisible(false);
                        JOptionPane.showMessageDialog(null,"\nEl  resultado en es: "+
                        "\n"+ sd2.h,"Decimal_Hexadecimal",JOptionPane.WARNING_MESSAGE, new ImageIcon("./data/ima1.png"));
                    this.setVisible(true);
                    sd2.h="";
                    }
            }
            if(e.getSource() == bDB){
                   Decimal = tfM.getText();
                    trans = Integer.parseInt(Decimal);
                    Decimal_Binario sd3 = new Decimal_Binario();

                    if (trans<0) {
                        JOptionPane.showMessageDialog(null,"Solo se permiten números positivos!!","Warning!",JOptionPane.WARNING_MESSAGE,null);
                    } else {
                    this.setVisible(false);
                        JOptionPane.showMessageDialog(null,"\nEl  resultado en es: "+
                        "\n"+ sd3.b,"Decimal_Binario",JOptionPane.WARNING_MESSAGE, new ImageIcon("./data/ima1.png"));
                    this.setVisible(true);
                    }
            }
            if(e.getSource() == bOD){
                    Octal = tfM.getText();
                    trans = Integer.parseInt(Octal,8);
                    Octal_Decimal so1 = new Octal_Decimal();
                    if(trans<11){
                           switch(trans){
                                                                    case 1:
                                                                        oct=1;
                                    break;
                                                                    case 2:
                                                                        oct=2;
                                    break;
                                                                    case 3:
                                                                        oct=3;
                                    break;
                                                                    case 4:
                                                                        oct=4;
                                    break;
                                                                    case 5:
                                                                        oct=5;
                                    break;
                                                                    case 6:
                                                                        oct=6;
                                    break;
                                                                    case 7:
                                                                        oct=7;
                                    break;
                                                                    case 10:
                                                                         oct=8;
                                    break;
                            }
                        }
                        oct=so1.o;
                        if(trans<0){
                        JOptionPane.showMessageDialog(null,"Solo se permiten números positivos!!","Warning!",JOptionPane.WARNING_MESSAGE,null);
                        } else {
                    this.setVisible(false);
                        JOptionPane.showMessageDialog(null,"\nEl  resultado en es: "+
                        "\n"+ oct, ".",JOptionPane.WARNING_MESSAGE, new ImageIcon("./data/ima1.png"));
                    this.setVisible(true);
            }
            }
            if(e.getSource() == bOH){
                        Octal = tfM.getText();
                        trans = Integer.parseInt(Octal,8);
                        Octal_Hexadecimal sh2=new Octal_Hexadecimal();
                        if(trans<0){
                            JOptionPane.showMessageDialog(null,"Solo se permiten números positivos!!","Warning!",JOptionPane.WARNING_MESSAGE,null);
                        } else {            
                    this.setVisible(false);
                        JOptionPane.showMessageDialog(null,"\nEl  resultado en es: "+
                        "\n"+ sh2.h1,".",JOptionPane.WARNING_MESSAGE, new ImageIcon("./data/ima1.png"));
                    this.setVisible(true);
                    sh2.h1="";
                 }
            }
            if(e.getSource() == bOB){
                        Octal = tfM.getText();
                        trans = Integer.parseInt(Octal,8);     
                        Octal_Binario so3=new Octal_Binario();               
                        if(trans<0 ){
                            JOptionPane.showMessageDialog(null,"Escribe algo, porfavor ",".",JOptionPane.WARNING_MESSAGE,null);                
                        } else {
                    this.setVisible(false);            
                            JOptionPane.showMessageDialog(null,"\nEl  resultado es: "+
                            " \n"+ so3.b2,".",JOptionPane.WARNING_MESSAGE, new ImageIcon("./data/ima1.png")); 
                    this.setVisible(true);
                    so3.b2="";
                }
            }
            if(e.getSource() == bHD){
                      Hexadecimal = tfM.getText();
                      trans = Integer.parseInt(Hexadecimal,16);
                      Hexadecimal_Decimal sh1=new Hexadecimal_Decimal();      
                      if(trans<0){
                        JOptionPane.showMessageDialog(null,"Escribe algo, porfavor ",".",JOptionPane.WARNING_MESSAGE,null);                
                    } else {            
                    this.setVisible(false);  
                        JOptionPane.showMessageDialog(null,"\nEl  resultado es: "+
                        "\n"+ sh1.b16,".",JOptionPane.WARNING_MESSAGE, new ImageIcon("./data/ima1.png")); 
                    this.setVisible(true);
                }
            }
            if(e.getSource() == bHO){
                     Hexadecimal = tfM.getText();
                     trans = Integer.parseInt(Hexadecimal,16); 
                     Hexadecimal_Octal sh2=new Hexadecimal_Octal();
                    if(trans<0 ){
                        JOptionPane.showMessageDialog(null,"Escribe algo, porfavor ",".",JOptionPane.WARNING_MESSAGE,null);                
                    } else {       
                    this.setVisible(false);
                        JOptionPane.showMessageDialog(null,"\nEl  resultado es: "+
                        "\n"+ sh2.b162,".",JOptionPane.WARNING_MESSAGE, new ImageIcon("./data/ima1.png")); 
                    this.setVisible(true);
                }
            }
            if(e.getSource() == bHB){
                    Hexadecimal = tfM.getText();
                    trans = Integer.parseInt(Hexadecimal,16);
                    Hexadecimal_Binario sh3=new Hexadecimal_Binario();           
                    if(trans<0 ){
                        JOptionPane.showMessageDialog(null,"Escribe algo, porfavor ",".",JOptionPane.WARNING_MESSAGE,null);                
                    } else {        
                    this.setVisible(false);           
                        JOptionPane.showMessageDialog(null,"\nEl  resultado es: "+
                        "\n"+ sh3.b163,".",JOptionPane.WARNING_MESSAGE, new ImageIcon("./data/ima1.png")); 
                    this.setVisible(true);
                }
            }
            if(e.getSource() == bBD){
                    Binario= tfM.getText();
                    trans = Integer.parseInt(Binario,2);
                    trans = Integer.parseInt(Binario);
                    Binario_Decimal sb1=new Binario_Decimal();               
                    if(trans<0){
                        JOptionPane.showMessageDialog(null,"Escribe algo, porfavor ",".",JOptionPane.WARNING_MESSAGE,null);                
                    } else {
                    this.setVisible(false);
                        JOptionPane.showMessageDialog(null,"\nEl  resultado es: "+
                        "\n"+ sb1.de,".",JOptionPane.WARNING_MESSAGE, new ImageIcon("./data/ima1.png"));
                    this.setVisible(true);
                   }
            }
            if(e.getSource() == bBO){
                    Binario= tfM.getText();
                    trans = Integer.parseInt(Binario,2);
                    trans = Integer.parseInt(Binario);
                    Binario_Octal sb2=new Binario_Octal();
                    if(trans<0){
                        JOptionPane.showMessageDialog(null,"Escribe algo, porfavor ",".",JOptionPane.WARNING_MESSAGE,null);                
                    } else {       
                    this.setVisible(false);            
                        JOptionPane.showMessageDialog(null,"\nEl  resultado es: "+
                        "\n"+ sb2.o,".",JOptionPane.WARNING_MESSAGE, new ImageIcon("./data/ima1.png")); 
                    this.setVisible(true);
                    sb2.o="";
                }
            }
            if(e.getSource() == bBH){
                        Binario= tfM.getText();
                        trans = Integer.parseInt(Binario,2);
                        trans = Integer.parseInt(Binario);
                        Binario_Hexadecimal sb3=new Binario_Hexadecimal();
                        if(trans<0){
                            JOptionPane.showMessageDialog(null,"Escribe algo, porfavor ",".",JOptionPane.WARNING_MESSAGE,null);                
                        } else {
                    this.setVisible(false);         
                        JOptionPane.showMessageDialog(null,"\nEl  resultado es: "+
                        "\n"+ sb3.h1,".",JOptionPane.WARNING_MESSAGE, new ImageIcon("./data/ima1.png"));
                    this.setVisible(true);
                }
            }
        } catch(NumberFormatException ne) {
            JOptionPane.showMessageDialog(null,"El dato ingresado es invalido ",".",JOptionPane.ERROR_MESSAGE,null);      
        }  
             if(e.getSource() == bigu){
                switch(cam_){
                        case 1:
                            n3=Double.parseDouble(tfM.getText());
                            R_=R+n3;
                            tfM.setText(Double.toString(R_));
                            tfA.setText("");
                            tfS.setText("");
                            break;
                        case 2:
                            n3=Double.parseDouble(tfM.getText());
                            R_=R-n3;
                            tfM.setText(Double.toString(R_));
                            tfA.setText("");
                            tfS.setText("");
                            break;
                        case 3:
                            n3=Double.parseDouble(tfM.getText());
                            R_=R/n3;
                            tfM.setText(Double.toString(R_));
                            tfA.setText("");
                            tfS.setText("");
                            break;
                        case 4:
                            n3=Double.parseDouble(tfM.getText());
                            R_=R*n3;
                            tfM.setText(Double.toString(R_));
                            tfA.setText("");
                            tfS.setText("");
                            break;
                }              
          }
    }
    
    public void stateChanged(ChangeEvent e){
        if (rbD.isSelected() == true){
            bDO.setVisible(true);
            bDH.setVisible(true);
            bDB.setVisible(true);
            bOD.setVisible(false);
            bOH.setVisible(false);
            bOB.setVisible(false);
            bHD.setVisible(false);
            bHO.setVisible(false);
            bHB.setVisible(false);
            bBD.setVisible(false);
            bBO.setVisible(false);
            bBH.setVisible(false);
            ba.setEnabled(false);
            bb.setEnabled(false);
            bc.setEnabled(false);
            bd.setEnabled(false);
            be.setEnabled(false);
            bf.setEnabled(false);
            bsen.setEnabled(true);
            bcos.setEnabled(true);
            btan.setEnabled(true);
            brai.setEnabled(true);
            bsu.setEnabled(true);
            bre.setEnabled(true);
            bdi.setEnabled(true);
            bmu.setEnabled(true);
            bigu.setEnabled(true);
        }
        if (rbO.isSelected() == true){
            bDO.setVisible(false);
            bDH.setVisible(false);
            bDB.setVisible(false);
            bOD.setVisible(true);
            bOH.setVisible(true);
            bOB.setVisible(true);
            bHD.setVisible(false);
            bHO.setVisible(false);
            bHB.setVisible(false);
            bBD.setVisible(false);
            bBO.setVisible(false);
            bBH.setVisible(false);   
            ba.setEnabled(false);
            bb.setEnabled(false);
            bc.setEnabled(false);
            bd.setEnabled(false);
            be.setEnabled(false);
            bf.setEnabled(false);
            bsen.setEnabled(false);
            bcos.setEnabled(false);
            btan.setEnabled(false);
            brai.setEnabled(false);
            bsu.setEnabled(false);
            bre.setEnabled(false);
            bdi.setEnabled(false);
            bmu.setEnabled(false);
            bigu.setEnabled(false);
        }
        if (rbH.isSelected() == true){
            bDO.setVisible(false);
            bDH.setVisible(false);
            bDB.setVisible(false);
            bOD.setVisible(false);
            bOH.setVisible(false);
            bOB.setVisible(false);
            bHD.setVisible(true);
            bHO.setVisible(true);
            bHB.setVisible(true);
            bBD.setVisible(false);
            bBO.setVisible(false);
            bBH.setVisible(false);
            ba.setEnabled(true);
            bb.setEnabled(true);
            bc.setEnabled(true);
            bd.setEnabled(true);
            be.setEnabled(true);
            bf.setEnabled(true);
            bsen.setEnabled(false);
            bcos.setEnabled(false);
            btan.setEnabled(false);
            brai.setEnabled(false);
            bsu.setEnabled(false);
            bre.setEnabled(false);
            bdi.setEnabled(false);
            bmu.setEnabled(false);
            bigu.setEnabled(false);
                                                     
        }
        if (rbB.isSelected() == true){
            bDO.setVisible(false);
            bDH.setVisible(false);
            bDB.setVisible(false);
            bOD.setVisible(false);
            bOH.setVisible(false);
            bOB.setVisible(false);
            bHD.setVisible(false);
            bHO.setVisible(false);
            bHB.setVisible(false);
            bBD.setVisible(true);
            bBO.setVisible(true);
            bBH.setVisible(true);
            ba.setEnabled(false);
            bb.setEnabled(false);
            bc.setEnabled(false);
            bd.setEnabled(false);
            be.setEnabled(false);
            bf.setEnabled(false);
            bsen.setEnabled(false);
            bcos.setEnabled(false);
            btan.setEnabled(false);
            brai.setEnabled(false);
            bsu.setEnabled(false);
            bre.setEnabled(false);
            bdi.setEnabled(false);
            bmu.setEnabled(false);
            bigu.setEnabled(false);
        }                
    }
    
    public static String acortar(String cadena, int n) {
        int indice = n > cadena.length() ? 0 : cadena.length() - n;
        return cadena.substring(0, indice);
    }
    
    public static void main(String[] args) {
        Proyec_Java s1 = new Proyec_Java();
        s1.setBounds(0, 0, 220,290);
        s1.setVisible(true);
        s1.setResizable(false);
        s1.setLocationRelativeTo(null);
    }
}