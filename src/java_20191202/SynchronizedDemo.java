package java_20191202;

public class SynchronizedDemo implements Runnable {
	int x;
	int y;

	public synchronized void run() { // 두 스레드가 같은 객체를 공유할떄 한번 제어권을 가진 놈은 다시넘기지
		// 않는다.
		for (int i = 0; i < 5; i++) { // 한스레드가 돌아갈떄 제어권을 뻇기지 않는다.
			x++;
			y++;
			String threadName = Thread.currentThread().getName();
			System.out.printf("x : %d. y : %d - %s%n", x, y, threadName);
		}
	}

	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		SynchronizedDemo s2 = new SynchronizedDemo();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s1);
		// 서로 다른 객체는 각각 1000번 돌림, 같은 객체는 공유하기 떄문에 2000번 돌림
		// 스레드가 객체를 공유하면 문제가 생길수있음.

		t1.start();
		t2.start(); //특정시간간격만큼 돌릴수있다.

		while(true){
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 new Thread(s1).start();
		}
	}
}

//무한 루프 하루에 한번씩 오늘 가입하는 회원 정리해서 보고해라 
//스레드 사용해서 일정기간보고