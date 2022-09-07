package oops.abstraction;

abstract class A 
{
	public String name = "abc";
	
	abstract public void test();
	
	public void test1() 
	{
		System.out.println("testA");
	}
	public A() 
	{
		
	}
	
}

public class Example1 extends A
{
	public static void main(String[] args) 
	{
		A a = new Example1();
		a.test();
		a.test1();
	}
	public void test()
	{
		System.out.println("test");
	}
} 
