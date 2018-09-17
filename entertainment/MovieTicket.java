package myDataTypes.entertainment;
import myDataTypes.*;

public class MovieTicket 
{
	char mName;
	char [] ticketNumber;
	char theatreName;
	double cost;
	int date;
	int timing;
	char[] seatNo;
	
	
	public void validFromAndTo()
	{
		System.out.println(" details of ticket ");
	}
	
	public MovieTicket()
	{
		System.out.println(" default");
	}
	
	public MovieTicket(char mName,char ticketNumber,char theaterName,double cost,int date,int timing,char seatNo)
	{
		System.out.println(" parameterised");
	}
}
