package java_20191129;

public class ReturnDemo {
	public void m() {
		int a = 10;
		int b = 20;
		int c = a + b;

		if (c == 30) {
			return;   // 30이 되면 아래 문장을 실행하고 싶지 않다면 리턴 사용
		}

		System.out.printf("a+b = %d%n", c);
	}

	public static void main(String[] args) {
		int a = 10;
		int b = a;
		int c = a + b;

		ReturnDemo rd = new ReturnDemo();
		rd.m();

		if (c == 20) {
			return;
		}
		System.out.println(c);
	}

}


//메서드를 만들다가 특정조건이 됬을때 이후의 문장을 실행하고 싶지 않다면 활용(여기서의 리턴은 메서드가 끝났다는 의미)
//void일경우만
//