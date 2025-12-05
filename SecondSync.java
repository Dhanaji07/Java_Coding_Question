package basicmulti;
public class SecondSync {
	String lock="Chabi";
	
	public void display()
	{
		System.out.println("Before Lock");
		synchronized (lock)
		{
			for(int i=1;i<=5;i++)
		{
		System.out.println(i);
		}
		System.out.println("After Lock");
		}
	}
	public static void main(String[] args) {
		SecondSync d1= new SecondSync();
		Runnable r1 =new Runnable() {
			public void run()
			{
				d1.display();
				
			}
		};
		
		Thread t1=new Thread(r1);
		Runnable r2= new Runnable() {
			public void run()
			{										
				d1.display();
			}
		};
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		

	}

}
