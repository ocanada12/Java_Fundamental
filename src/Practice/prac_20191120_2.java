package Practice;

public class prac_20191120_2 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 15; i++) {
			sum += i;
			if (i == 10)
				break;
		}
		System.out.println(sum);
	}
}
