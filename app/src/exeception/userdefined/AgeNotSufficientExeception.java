package exeception.userdefined;

public class AgeNotSufficientExeception extends RuntimeException
{
	private static String messge;

	public AgeNotSufficientExeception(String message)
	{
		super(messge);
	}
}
