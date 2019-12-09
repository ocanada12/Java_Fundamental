package Practice;

public class Prac_20191209 extends Thread {
	public Prac_20191209(String threadName) {
		// TODO Auto-generated constructor stub
	}
	
	public void run(){
		for (int i = 0; i < 100; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.printf("%s : %d%n ",threadName,i);
		}
	}
	public static void main(String[] args) {
		Prac_20191209 p1 = new Prac_20191209("first Thread");
		p1.start();
		
		Prac_20191209 p2 = new Prac_20191209("second Thread");
		p2.start();
	}
}

