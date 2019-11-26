package java_20191126;
import java.lang.*;
public class SubDemo extends Object {
	public SubDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Sub s1 = new Sub();
		s1.makeMoney();
		s1.gotoSchool();
		s1.play("omok");
		
		s1.money = 10000;
		s1.chicken = "교촌치킨 2마리";
	}
}
//변수는 프로텍티드에서 상속받은경우 다른 패키지 상속 가능 