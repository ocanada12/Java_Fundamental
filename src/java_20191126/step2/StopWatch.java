package java_20191126.step2;

public class StopWatch {
	long startTime;
	long endTime;
	long startNanoTime;
	long endNanoTime;

	public void start() {
		startTime = System.currentTimeMillis();
	}

	public void stop() {
		endTime = System.currentTimeMillis();

	}

	public double getElapsedMilliTime() {
		return (double) (endTime - startTime) / (double) 1000;
	}

	public void startNano() {
		startNanoTime = System.nanoTime();
	}

	public void stopNano() {
		endNanoTime = System.nanoTime();
	}

}
