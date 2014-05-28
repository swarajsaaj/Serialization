
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class address implements Serializable
{
    String add;
   public address(String a)
    {   
        add=a;
    }
   
}
        public class serialization1 
{
            public static void main(String[] args) throws FileNotFoundException, IOException 
            {
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter address");
                String inputAddress = scn.next();
                
                FileOutputStream fs = new FileOutputStream("address.ser");
                ObjectOutputStream out = new ObjectOutputStream (fs);
                address a1 = new address(inputAddress);
                out.writeObject(a1);
                out.close();
                fs.close();
                
            }
}
