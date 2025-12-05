package basicmulti;

public class FirstThread extends Thread {
		public void run() 
		{
			System.out.println("Dhanaji");
		}
		
		public static void main(String[] args) 
		{
			FirstThread t1 = new FirstThread();
			FirstThread t2 = new FirstThread();
			FirstThread t3 = new FirstThread();
			
			t1.start();
			t2.start();
			t3.start();

		}

	}