package ie.gmit.rmifolder2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class resultatorimpl extends UnicastRemoteObject implements resultator // uses the implemented methods from the resultator 
{
	private static final long serialVersionUID = 1L; // allows the class to be found again at a much quicker speed

	// private variables
	private boolean processed;
	private String result;

	protected resultatorimpl() throws RemoteException
	{
		super();
	}

	@Override
	public String getResult() throws RemoteException
	{
		return result;
	}

	@Override
	public void setResult(String result) throws RemoteException
	{
		this.result = result;

	}

	public boolean isProcessed()
	{
		return processed;
	}

	public void setProcessed()
	{
		this.processed = true;
	}

}