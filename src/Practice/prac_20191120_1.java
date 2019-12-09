package Practice;

//컨티뉴 문 => 아래문을 수행하지 않고 위로 올라간다.

public class prac_20191120_1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;
			}

			sum += i;
		}
		System.out.println(sum);
	}
}
