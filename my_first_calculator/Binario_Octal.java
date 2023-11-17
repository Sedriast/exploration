package ll.proyec_java.ll;

public class Binario_Octal extends Proyec_Java{
    
    Binario_Decimal sb12=new Binario_Decimal();
    public int a,b,c,d;
    public static String o = "",a1="";
    char d1[]={'0','1','2','3','4','5','6','7'};

        public Binario_Octal (){
 
        a=sb12.de;
        if (a == 0) {
            o = "0";
        } else {
            while(a>0){
            b = a % 8;
            o = d1[b] + o;
            a /= 8;
        }
      }
   }
}

