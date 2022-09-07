package exeception.userdefined;

public class BankBalanceNotSufficientExpection extends RuntimeException{
	
	public BankBalanceNotSufficientExpection(String message)
	{
		super(message);
	}
}
