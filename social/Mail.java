package myDataTypes.social;
import myDataTypes.*;

public class Mail 
{
	char [] emailID;
	char name;
	char typeOfDomain;
	char networkName;
	
	public void recievingAndSending()
	{
		System.out.println(" recieving and sending");
	}
	public void networkStatus()
	{
		System.out.println(" networkstatus");
	}
	
	public Mail()
	{
		System.out.println(" default");
	}
	
	public Mail(char emailId,char name,char typeOfDomain,char networkName)
	{
		System.out.println(" parameterised");
	}
}
