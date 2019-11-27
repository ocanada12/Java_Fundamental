package Java_20191127.step6;

//클래스가 다르므로 굳이 나노 쓸필요없음.
public class StopNanoWatch extends StopWatch{

	private void start() {
		setStartTime(System.nanoTime());
	}

	private void stop() {
		setEndTime(System.nanoTime());
	}

	private double getElapsedTime() {
		return (double) (getEndTime() - getStartTime()) / (double) 1000000000;
	}

	public void run() {
		start();
		for (long i = 0; i < 8000000000l; i++) {
		}
		stop();

		double elapsedTime = getElapsedTime();

		System.out.printf("경과시간 : %.9f %n", elapsedTime);

	}
}