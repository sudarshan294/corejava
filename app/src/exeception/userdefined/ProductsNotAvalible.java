package exeception.userdefined;

public class ProductsNotAvalible extends RuntimeException {
	public static String messge;
	public ProductsNotAvalible (String message)
	{
		super(messge);
	}
}
