import java.rmi.*;

public class MyServer{
    public static void main(String args[]){
        try{
            Multiplier stub = new MultiplierRemote();
            Naming.rebind("rmi://localhost:5001/cal",stub);
            System.out.println("Server started...");
        }catch(Exception e){System.out.println(e);}
    }
}  