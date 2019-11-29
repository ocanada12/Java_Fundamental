package homework;

public class Practice {
	public static void main(String[] args) {

		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int i = 7;
		int j = 31;

		for (int q = 1; q < i; q++) {
			System.out.print("\t");
		}

		int cnt = i - 1;
		for (int q = 1; q <= j; q++) {
			System.out.print(q + "\t");
			cnt++;
			if (cnt == 7) {
				cnt = 0;
				System.out.println("\n");
			}
		}
	}

}
