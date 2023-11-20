package ll.proyec_java.ll;


public class Octal_Hexadecimal extends Proyec_Java {
    
    public int r_,h;
    public static String h1="";
    char d2[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    Proyec_Java rec=new Proyec_Java();

    public Octal_Hexadecimal (){
        
        h=rec.trans;
        if (h==0) {
            h1= "0";
        } else {
        while(h>0){
            r_= h % 16;
            h1 = d2[r_] + h1;
            h/= 16;
        }
        }
    }
}