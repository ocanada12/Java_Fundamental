package Java_20191127.step3;
//클래스가 다르므로 굳이 나노 쓸필요없음.
public class StopNanoWatch {
	long startTime;
	long endTime;

	public void start() {
		startTime = System.nanoTime();
	}

	public void stop() {
		endTime = System.nanoTime();
	}

	public double getElapsedTime() {
		return (double) (endTime - startTime) / (double) 1000000000;
	}
}