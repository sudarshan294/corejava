package app;

public class B {
	 
	public static void main(String[] args) {
		B b = new B();
		b.test2();
		b.test();
		b.add(30, 20);
		b.sub(30, 20);
		b.mul(30, 20);
		b.div(30, 20);
	}
	
	public void test2()
	{
		System.out.println("test2 method");
	
	}
	
	public void test()
	{
		System.out.println("test--1");
	}
	
	public void add(int i,int j)
	{
		int k= i+j;
		System.out.println(+k);
	}
	public void sub(int i,int j)
	{
		int k=i-j;
		System.out.println(+k);		
	}
	public void mul(int i,int j)
	{
		int k=i*j;
		System.out.println(+k);		
	}
	public void div(int i,int j)
	{
		int k=i/j;
		System.out.println(+k);		
	}
}
