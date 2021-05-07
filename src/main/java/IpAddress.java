

import java.util.Arrays;

public class IpAddress {
    
    
    public static void main(String[] args) {

       // var ip_address = "163.121.12.30";

       //String[] output = ip_address.split("\\.");

        //Arrays.stream(output).forEach(part -> System.out.println(part));
        String ip_adress = "163.121.12.30";
        Checkip arr = new Checkip();
        
        arr.doOperation(ip_adress);
}
  
}