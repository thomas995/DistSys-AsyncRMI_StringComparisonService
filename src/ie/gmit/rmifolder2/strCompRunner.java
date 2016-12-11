package ie.gmit.rmifolder2;

import java.rmi.RemoteException;

public class strCompRunner implements Runnable
{	
	resultator r;
	compStringable inputStringComparison;
	String stringone;
	String stringtwo;

	public strCompRunner(resultator r, compStringable inputStringComparison, String stringone, String stringtwo)
	{
		this.r = r;
		this.inputStringComparison = inputStringComparison;
		this.stringone = stringone;
		this.stringtwo = stringtwo;
	}

	@Override
	public void run() 
	{
		try 
		{
			r.setResult(inputStringComparison.doMatch(stringone, stringtwo));
			try 
			{
				Thread.sleep(10000); // sleeps/pauses the application for 10 seconds as specificed in the project spec
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			r.setProcessed();
			System.out.println(r + "is processed");
		}
		catch (RemoteException e) 
		{
			e.printStackTrace();
		}
	}
	
}
