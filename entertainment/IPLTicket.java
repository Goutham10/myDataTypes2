package myDataTypes.entertainment;
import myDataTypes.*;

public class IPLTicket 
{
	public void innings()
	{
		System.out.println(" game going on.....");
	}
	public void breakTime()
	{
		System.out.println(" break time ");
	}
	public IPLTicket()
	{
		System.out.println(" default construct ");
	}
	public IPLTicket(char [] ticketNumber,double cost,char typeOfTicket,char stadiumName,int date)
	{
		System.out.println(" parameterised ");
	}
	public static void main(String[] args) 
	{
		char [] ticketNumber;
		double cost;
		char typeOfTicket;
		char stadiumName;
		int date;
		IPLTicket i= new IPLTicket();
		i.innings();
		i.breakTime();
	}

}
