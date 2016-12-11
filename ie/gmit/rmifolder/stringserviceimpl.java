package ie.gmit.rmifolder;

public class stringServiceimpl extends UnicastRemoteObject implements stringService
{
		import java.rmi.RemoteException;
		import java.rmi.server.UnicastRemoteObject;
		
		private resultator r;
		private static final long serialVersionUID = 1L;

		public stringserviceimpl() throws RemoteException
		{
			
		}

		@Override
		public Resultator inputStringComparison(String stringone, stringtwo, String algo) throws RemoteException
		{
			r = new resultatorimpl(); 
			InputCompare inpCom = new InputCompare(stringone, stringtwo, r, algo);
			Thread comp = new Thread(inpCom);
			comp.start();
				
			return r; 
		}
	}