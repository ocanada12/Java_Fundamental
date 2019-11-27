package Java_20191127.step1;

public class FootStopNanoWatch {

	long startNanoTime;
	long endNanoTime;

	public double getElapsedNanoTime() {
		return (double) (endNanoTime - startNanoTime) / (double) 1000000000;
	}

	public static void main(String[] args) {
		FootStopNanoWatch f = new FootStopNanoWatch();

		f.startNanoTime = System.nanoTime();

		for (long i = 0; i < 5000000000l; i++) {
		}

		f.endNanoTime = System.nanoTime();

		double elapsedTime = f.getElapsedNanoTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}

}
