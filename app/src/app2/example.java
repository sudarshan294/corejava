package app2;

public class example {
	 public static void main(String[] args) {
		 
		example c =new example();
		int k = c.add(20, 20);
		System.out.println(k);
	}

	public int add(int i,int j)
	{
		int k = i+j;
		return(k);
	}
	public int sub(int i,int j)
	{
		int k = i-j;
		return(k);
	}
	public int mul(int i,int j)
	{
		int k = i*j;
		return(k);
	}
	public int div(int i,int j)
	{
		int k = i/j;
		return(k);
	}
 
}
 