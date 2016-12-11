package ie.gmit.sw;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import ie.gmit.stringservice;
import ie.gmit.stringserviceimpl;

// sets up the registry for the database once its up and running, 
//shows a message to confirm that it is in fact working
public class servant
{
	
	public static void main(String[] args) throws Exception
	{
		
		stringservice ss = new stringserviceimpl();
		
		LocateRegistry.createRegistry(1099);

		Naming.rebind("stringservice", ss);
		System.out.println("Service has been activated(1099)...");
	}

}
