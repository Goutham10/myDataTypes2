package myDataTypes.employee;
import myDataTypes.*;

public class Employee 
{
	String empAge;
	String empName;
	String empID;
	String ephoneNumber;
	String eaddress;
	String empEmail;
	
	public void workPerfomance()
	{
		System.out.println(" good ");
	}
	public void remarks()
	{
		System.out.println(" not bad ");
	}
	public void currentStatus()
	{
		System.out.println(" working ");
	}
	public Employee()
	{
		System.out.println(" default construct ");

	}
	public Employee(String age,String eName,String eID,String phoneNumber,String address,String email)
	{
		empAge=age;
		empName=eName;
		empID=eID;
		ephoneNumber=phoneNumber;
		eaddress=address;
		empEmail=email;
		System.out.println(" parameterised ");

	}

}
