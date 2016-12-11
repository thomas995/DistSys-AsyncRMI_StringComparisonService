package ie.gmit;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface stringservice extends Remote
{
    public resultator compare(String s, String t, String algo) throws RemoteException;
}
