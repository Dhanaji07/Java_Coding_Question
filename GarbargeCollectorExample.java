package basicmulti;

public class GarbargeCollectorExample {

	public void finalize() {
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("HARE KIRSHNA");
	}
	public static void main(String[] args) {
		GarbargeCollectorExample obj1=new GarbargeCollectorExample();
		obj1 =null;
		GarbargeCollectorExample obj2=new GarbargeCollectorExample();
		obj2=null;
		GarbargeCollectorExample obj3=new GarbargeCollectorExample();
		System.out.println(obj3.hashCode());
		System.gc();
	}

}

