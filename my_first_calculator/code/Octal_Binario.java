package ll.proyec_java.ll;

public class Octal_Binario extends Proyec_Java{
    
            public int B2;
            public String b2 = "";
            Proyec_Java rec = new Proyec_Java();
    
                public Octal_Binario(){
                    
             B2=rec.trans;
             if (B2 > 0) {
            while (B2 > 0) {
                if (B2 % 2 == 0) {
                    b2 = "0" + b2;
                } else {
                    b2 = "1" + b2;
                }
                B2 = (int) B2 / 2;
            }
        } else if (B2 == 0) {
            b2 = "0";
        }                    
   }
}
