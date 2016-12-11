package ie.gmit;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

import

public class stringserviceimpl extends UnicastRemoteObject implements stringservice
{	

		private resultator r;
		private static final long serialVersionUID = 1L;

		@Override
		public resultator InputCompare(String s, String t, String algo) throws RemoteException 
		{
				r = new resultatorimpl(); 
				InputCompare inpCom = new InputCompare(stringone, stringtwo, r, algo);
				Thread comp = new Thread(inpCom);
				comp.start();
					
				return r; 
		}
}

