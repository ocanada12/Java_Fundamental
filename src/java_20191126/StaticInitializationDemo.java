package java_20191126;
//i18n 국제화 (internationalizaiton)
//l101 지역화 (localization)
public class StaticInitializationDemo {

	int age; // instance variable
	static String title; // static variable
	static{
		System.out.println("static block");
		title = "모기지론";
		
	}
	// 생성자의 접근한정자는 객체 생성과 관련이 있다.
	private StaticInitializationDemo(int age){ //객체생성하지말라고 프라이빗으로 하는경우 있음. 1. 모든 메서드가 스태틱(math), 2. 유
		this.age = age;
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		new StaticInitializationDemo(10);
		new StaticInitializationDemo(20);
		new StaticInitializationDemo(30);
		
	}
}
