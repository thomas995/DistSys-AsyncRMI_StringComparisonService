package ie.gmit.rmifolder2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface resultator extends Remote
{
	// takes in the inputs of the user and processes it when it is called
	public String getResult() throws RemoteException;
	public void setResult(String result) throws RemoteException;
	public boolean isProcessed() throws RemoteException;
	public void setProcessed() throws RemoteException;
	
}
