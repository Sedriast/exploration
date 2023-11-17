package ll.proyec_java.ll;

public class Decimal_Hexadecimal extends Proyec_Java{
    
    public int H,r,a;
    public static String h = "";
    char d1[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    Proyec_Java rec=new Proyec_Java();
    
    public Decimal_Hexadecimal(){

        H=rec.trans;
        a = H;
        
        while(a>0){
            r = a % 16;
            h = d1[r] + h;
            a /= 16; 
        }
         if (H == 0) {
            h = "0";
        }
    }
}