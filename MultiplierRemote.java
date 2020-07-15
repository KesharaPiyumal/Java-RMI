import java.rmi.*;
import java.rmi.server.*;
public class MultiplierRemote extends UnicastRemoteObject implements Multiplier{
    MultiplierRemote()throws RemoteException{
        super();
    }
    public int multiply(int x,int y){return x*y;}
}
