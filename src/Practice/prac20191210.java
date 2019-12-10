package Practice;

public class prac20191210 implements Runnable {

	public void run() {
		for (int i = 0; i < 100; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.printf("%s %d %n", threadName, i);
		}
	}

	public static void main(String[] args) {
		prac20191210 p1 = new prac20191210();
		Thread t1 = new Thread(p1);
		t1.start();
		

		prac20191210 p2 = new prac20191210();
		Thread t2 = new Thread(p2);
		t2.start();

	}

}