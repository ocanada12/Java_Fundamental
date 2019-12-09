package java_20191120;

public class ContinueDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;

			}
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 6)
					continue;
				System.out.printf("%d*%d=%d%n", i, j, i * j);
			}

		}
	}
}
