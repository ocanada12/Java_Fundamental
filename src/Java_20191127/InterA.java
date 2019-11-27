package Java_20191127;
//인터페이스간 다중상속이 가능한다.
public interface InterA extends InterB, InterC{
	// 인터페이스 변수는 public static final 생략 가능
	double PI = 3.14;
	// 인터페이스 메서드의 접근 한정자를 붙이지 않으면 public
	// abstract 생략 가능
	void mA();
}
