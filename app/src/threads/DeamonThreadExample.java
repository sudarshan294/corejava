package threads;

public class DeamonThreadExample {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("main method");

		ThreadExample1 e1 = new ThreadExample1();

		e1.setDaemon(true);		// This is setting Thread as a Deamon 
		e1.start();

		for(int i=1; i<=10; i++)
		{
			System.out.println("Main Therad: "+i);

			Thread.sleep(1000L);
		}
		System.out.println("Parent Thread Completed....");
	}

	public void run()
	{
		System.out.println("run");

		for(int i=11; i<=30; i++)
		{
			System.out.println("Thread: "+i);

			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}	
