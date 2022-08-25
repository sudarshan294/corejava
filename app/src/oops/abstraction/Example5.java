package oops.abstraction;

interface E
{
/*	public static final*/ String name ="abc";
	public abstract void test1();
	public void test2();
	abstract void test3();
	void test4();
	int test5();
	
	public static void test6() //static method is use
	{
		
	}
	default void test7()      // default method is use
	{
		
	}
//	public void test8() // not use the normal method
//	{
		
//	}
}

public class Example5 implements E
{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int test5() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
