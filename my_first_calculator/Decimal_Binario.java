package ll.proyec_java.ll;

public class Decimal_Binario extends Proyec_Java{
    
            public int B1;
            public String b = "";
            Proyec_Java rec = new Proyec_Java();
            
            public Decimal_Binario(){
                
             B1=rec.trans;

             if (B1 > 0) {
            while (B1 > 0) {
                if (B1 % 2 == 0) {
                    b = "0" + b;
                } else {
                    b = "1" + b;
                }
                B1 = (int) B1 / 2;
            }
        } else if (B1 == 0) {
            b = "0";
        }
    }
}