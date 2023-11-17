package ll.proyec_java.ll;

public class Binario_Decimal extends Proyec_Java{
    
        int de_ = 0, po=0,de=0,bi,la;
        Proyec_Java rec=new Proyec_Java();
        
        public Binario_Decimal (){
 
        bi=rec.trans;
        while (bi != 0) {
            la= bi% 10;
            de += la * Math.pow(2, po);
            po++;
            bi = bi / 10;
        }
    }
}

