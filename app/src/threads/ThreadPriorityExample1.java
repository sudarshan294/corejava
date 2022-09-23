package threads;

public class ThreadPriorityExample1 {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("main method");

		ThreadExample1 e1 = new ThreadExample1();
		e1.setPriority(10);
		e1.start();

		System.out.println("Priority:  "+e1.getPriority());

		ThreadExample1 e2 = new ThreadExample1();
		e2.start();

		System.out.println("Priority:  "+e2.getPriority());

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
