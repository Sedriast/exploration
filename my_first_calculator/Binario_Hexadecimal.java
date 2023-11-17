package ll.proyec_java.ll;

public class Binario_Hexadecimal {
    
       Binario_Decimal sb12=new Binario_Decimal();
     public int H1,r1,a1;
    public static String h1 = "";
    char d11[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    Proyec_Java rec=new Proyec_Java();
    
    public Binario_Hexadecimal(){

        H1=sb12.de;
        a1 = H1;
        
        if (H1 == 0) {
            h1 = "0";
        } else {
             while(a1>0){
            r1 = a1 % 16;
            h1 = d11[r1] + h1;
            a1 /= 16; 
            }
        }
    }
}
