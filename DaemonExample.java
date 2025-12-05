package basicmulti;

public class DaemonExample extends Thread {
	public void run()
	{
		if (Thread.currentThread().isDaemon())
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The is daemon ");
		}
		else
		{
			System.out.println("This is user");
		}
	}

	public static void main(String[] args) {
		DaemonExample t1=new DaemonExample();
		DaemonExample t2=new DaemonExample();
		DaemonExample t3=new DaemonExample();
		t1.start();
		t2.start();
		t3.start();
//		t1.setDaemon();
//		t2.setDaemon();
		

	}

}
