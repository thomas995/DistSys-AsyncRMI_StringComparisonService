package ie.gmit.rmifolder2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class stringserviceimpl extends UnicastRemoteObject implements stringservice
{
		private resultator r;
		private static final long serialVersionUID = 1L;

		public stringserviceimpl() throws RemoteException
		{
			
		}

		@Override
		public resultator inputStringComparison(String stringone, String stringtwo, String algo) throws RemoteException
		{
			r = new resultatorimpl(); 
			//InputCompare inpCom = new InputCompare(stringone, stringtwo, r, algo);
			//Thread comp = new Thread(inpCom);
			//comp.start();
				
			return r; 
		}

	}