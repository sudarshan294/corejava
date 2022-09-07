package oops.polymorphism;

class parent
{
	
	public void test(int i)
	{
		System.out.println("parent");
	}
}

public class MethodOverridingExample extends parent
{
	public void test (int i)
	{
		System.out.println("child");
		
	}
	public static void main(String[] args) {
		
		MethodOverridingExample c = new MethodOverridingExample();
		c.test(10);
		
	}
}
