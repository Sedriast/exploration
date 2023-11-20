package ll.proyec_java.ll;

public final class Octal_Decimal extends Proyec_Java{
    
           int D= 0, con = 1, o;  
           
    public Octal_Decimal (){
        
        Proyec_Java rec=new Proyec_Java();
        o = rec.trans;
    }
    
        public int COD(int decimal){
                    while (o != 0){
                    D += (o % 8) *con;
                    o /= 8;
                    con *= 10;              
                     }
             return D;
        }
}

        