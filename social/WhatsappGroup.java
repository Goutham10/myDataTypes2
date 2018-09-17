package myDataTypes.social;
import myDataTypes.*;

public class WhatsappGroup 
{
	char[] gName;
	short noOfMembers;
	int dateOfCreation;
	char adminName;
	
	public void admin()
	{
		System.out.println(" admin ");
	}
	public void membersInteraction()
	{
		System.out.println(" memebers details.");
	}
	public WhatsappGroup()
	{
		System.out.println(" default");
	}
	public WhatsappGroup(char gName,short noOfMembers,int dateOfCreation,char adminName)
	{
		System.out.println(" parameterised");
	}
}
