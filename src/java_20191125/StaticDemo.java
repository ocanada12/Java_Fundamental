package java_20191125;

public class StaticDemo {
	static String name;
	int age;
    //멤버변수 자리
	
	public void m1() {
		name = "sung"; // 인스턴스 메서드에서는 static 변수 사용 가능
		age = 10; // 인스턴스 메서드에서는 인스턴스 변수 사용 가능
		m2(); // 인스턴스 메서드에서는 인스턴스 메서드 호출 가능
		m4(); // 인스턴스 메서드에서는  static 메서드 호출 가능
	}

	public void m2() {
		System.out.println("instance method m2()");
	}

	public static void m3() {
		name = "sung"; // 스태틱 메서드에는 스태틱 변수 사용 가능
		//age = 10; // 스태틱 메서드에서는 인스턴스 변수 사용 불가
		//m2(); // 스태틱 메서드에서는 인스턴스 메서드 호출 불가
		m4(); // 인스턴스메서드에서는  스태틱 메서드 호출 가능
		StaticDemo sd = new StaticDemo();
		sd.age = 10;
		sd.m2();
	}

	public static void m4() {
		System.out.println("static method m4()");
	}

}
