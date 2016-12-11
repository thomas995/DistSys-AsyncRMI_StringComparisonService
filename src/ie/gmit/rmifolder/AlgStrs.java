package ie.gmit.rmifolder;

import java.rmi.RemoteException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class AlgStrs implements Runnable // Allows this to be run as an executable
{
	public static void main(String[] args) throws RemoteException 
	{
		// creates a new instance of AssignAJob
		AssignAJob job_a = new AssignAJob();
		// Creates a new instance of stringserviceimpl
		stringserviceimpl SSI = new stringserviceimpl();
		
		// try catch for error handling
		try
		{
			SSI = new stringserviceimpl();
		} 
		catch (RemoteException e1) 
		{
			e1.printStackTrace();
		}
		
		// name of the blocking queue and instantiate a new instance of it
		BlockingQueue<stringserviceimpl> linkedBQueue = new LinkedBlockingQueue<stringserviceimpl>();
		
		// error handling 
		try 
		{
			linkedBQueue.put(SSI);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
			
		} 
		
		// outputs to the screen what is in each
		System.out.println("size of BlockingQueue before peek : " + linkedBQueue.size());       
		System.out.println("example of peek() in BlockingQueue: " + linkedBQueue.peek());
		System.out.println("size of BlockingQueue after peek : " + linkedBQueue.size());
		System.out.println("calling poll() on BlockingQueue: " + linkedBQueue.poll());
		System.out.println("size of BlockingQueue after poll : " + linkedBQueue.size());
		System.out.println("Added Task No:" + job_a.getJobNum()); 
	}

	@Override
	public void run() 
	{
		// necessary for the class to be run as an executable to display to the screen
	}

	public compStringable getNewInstance() 
	{
		return null;
	}

}