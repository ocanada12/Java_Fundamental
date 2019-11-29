package java_20191129;

public class TryCatchDemo {
	public static double getAvg(int k, int e) {
		int sum = k + e;
		double avg = (double) sum / (double) 2;
		return avg;
	}

	public static void main(String[] args) {
		try {
			int k = Integer.parseInt(args[0]);
			int e = Integer.parseInt(args[1]);
			double average = getAvg(k, e);
			System.out.printf("평균 : %.2f", average);
		} catch (NumberFormatException e) {
			// e.printStackTrace();
			// System.err.println(e.getMessage()); //잘못입력한 값 출력
			System.err.println("숫자를 넣어주세요");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("국어와 영어 점수를 넣어주세요");
			// 대부분 메서드에서는 예외가 발생할수있는 코드가 있으면 던져버리는 것이 좋다.
			//맨처음 호출한 놈에게 위임하는게 낫다.
		}
	}
}