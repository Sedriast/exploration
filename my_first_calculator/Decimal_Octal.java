package ll.proyec_java.ll;

public class Decimal_Octal extends Proyec_Java{
    
    public int O,r,a;
    public static String o = "";
    char d1[]={'0','1','2','3','4','5','6','7'};
    Proyec_Java rec=new Proyec_Java();
    
                public Decimal_Octal(){
        O=rec.trans;
        a = O;
        while(a>0){
            r = a % 8;
            o = d1[r] + o;
            a /= 8;
        }
         if (O == 0) {
            o = "0";
        } 
    }
}