package java_20191121;

public class ArrayDemo {
	public static void main(String[] args) {

		// 1. 배열 생성
		int[] a = new int[4];

		// 2. 배열의 할당
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;

		// 3. 배열의 출력
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// 배열 생성과 할당이 동시에
		int[] b = { 1, 2, 3, 4, }; // int[] b = new int[]{1,2,3,4,};

		// 배열의 값 변경(재할당)
		b[0] = 100;
		b[1] = 200;
		b[2] = 300;
		b[3] = 400;

		// enhanced for loop
		for (int temp : b) {
			System.out.println(temp);
		}
	}
}