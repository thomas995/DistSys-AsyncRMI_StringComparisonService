package ie.gmit;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class resultatorimpl extends UnicastRemoteObject implements resultator
{
	private static final long serialVersionUID = 1L;

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