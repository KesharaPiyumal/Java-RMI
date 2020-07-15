import java.rmi.*;
public class MyClient{
    public static void main(String args[]){
        try{
            Multiplier stub=(Multiplier)Naming.lookup("rmi://localhost:5001/cal");
            System.out.println("8 * 4 = " + stub.multiply(8,4));
        }catch(Exception e){}
    }
} 