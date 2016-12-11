package ie.gmit;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public abstract class compStringableImpl<Algo_DLHDL> extends UnicastRemoteObject implements stringservice
{	
	protected compStringableImpl() throws RemoteException 
	{
		super();
	}

	private static final long serialVersionUID = 4882785461053507547L;
	private Map<String, Algo_DLHDL> algorithms = new HashMap<String, Algo_DLHDL>();
			
	public resultator compStrs(String stringone, String stringtwo, String algoResult)
	{
		//compStringable inputStringComparison = algorithms.get(algoResult.toLowerCase()).getNewInstance();
		resultator r = null;
		try 
		{
			r = new resultatorimpl();
		} 
		
		catch (RemoteException e) 
		{
			e.printStackTrace();
		}
		
		//Thread createThread = new Thread(new strCompRunner(r, inputStringComparison, stringone, stringtwo));
		//createThread.start();
		return r;
	}
}


