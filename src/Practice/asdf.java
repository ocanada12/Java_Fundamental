package Practice;

public class asdf implements Runnable {

	public void run() {
		for (int i = 0; i < 100; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.printf("%s - %d%n", threadName, i);
		}
	}

	public static void main(String[] args) {
		asdf a1 = new asdf();
		Thread t1 = new Thread(a1,"first Thread");
				
				
		asdf a2 = new asdf();
		a2.run();
		

		
	}

}
