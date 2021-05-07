
public class Checkip {

    /* String x;
    public Checkip(String ip ) {
        x = ip;
    }*/
    
     void doOperation(String x)
    {
        String[] parts = x.split("\\.");
       // String [] out = {}  ;
       
        for( int i=0;i<parts.length;i++)       
        {
            System.out.println(parts[i]); 
           
        }
      
       //return out;
    } 

    
    
}
