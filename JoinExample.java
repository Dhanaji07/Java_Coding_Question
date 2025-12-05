package basicmulti;

public class JoinExample extends Thread{
	
public void run()
{
	for(int i=1;i<=5;i++)
	{
		System.out.println(i);
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
{
	System.out.println(Thread.currentThread().getName());
}
	public static void main(String[] args)throws InterruptedException{
	
		JoinExample t1 =new JoinExample();
		JoinExample t2 =new JoinExample();
		JoinExample t3 =new JoinExample();
			t1.start();
			t1.join(4000);
			t2.start();
			t2.join(3000);
			t3.start();
			t2.join(1000);
			
	}

}
