import java.rmi.*;
public interface Multiplier extends Remote{
    public int multiply(int x,int y)throws RemoteException;
}
