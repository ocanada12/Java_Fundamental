package Java_20191127.step1;

public class FootStopWatch {

	long startTime;
	long endTime;

	public double getElapsedTime() {
		return (double) (endTime - startTime) / (double) 1000;
	}

	public static void main(String[] args) {
		FootStopWatch f = new FootStopWatch();
		
		f.startTime = System.currentTimeMillis();

		for (long i = 0; i < 5000000000l; i++) {
		}

		f.endTime = System.currentTimeMillis();

		double elapsedTime = f.getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	}

}

// 스템2에서 클래스 분리
