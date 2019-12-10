package java_20191126;

public class CallbyRefDemo {
	public static void change(int i, int[] j) {
		i = 20;
		j[3] = 400;
	}

	public static void main(String[] args) {

		int a = 10;
		int b[] = { 1, 2, 3, 4 };

		System.out.println(a);
		System.out.println(b[3]);

		// a=> call by value, b=> call be reference
		CallbyRefDemo.change(a, b);

		System.out.println(a); // call by value 메서드 호출후 변화 없음
		System.out.println(b[3]); // call by reference 메서드 호출 후 번화 없음

		int[] c; // c 메모리에 올라와 있지 않음
		// System.out.println(c);
		c = new int[4]; // 메모리 작성과 할당이 동시에 일어남

		int[] d = null; // 메모리에 올라감
		System.out.println(d);
		d = new int[4]; // 할당이 일어남

		//

		int age = 0; // 지역변수는 젖근 한정자를 붙일 수없음.
		int t = age + 20;
		age = 10;

	}
}