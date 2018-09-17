package myDataTypes.entertainment;
import myDataTypes.*;

public class Movie 
{
	char mName;
	byte mReleaseDate;
	char mCrew;
	int duration;
	char mLanguage;
	char typeOfMovie;
	
	public void review()
	{
		System.out.println(" reviewing the movie");
	}
	public void successMeet()
	{
		System.out.println(" celebration ");
	}
	public void audioLaunch()
	{
		System.out.println(" promotion ");
	}
	
	public Movie()
	{
		System.out.println(" default ");
	}
	
	public Movie(char mName, byte mReleaseDate, char mCrew, int duration, char mLanguage,char typeOfMovie)
	{
		System.out.println(" parameterised ");
	}
}
