package java_20191126;
import java.lang.*;
public class Super extends Object {
	int money;
	public Super() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Super(int money){
		super();
		this.money=money;
	}
	public void makeMoney(){
		System.out.println("Super makeMoney()");
	}
	
	public void play(String omok){
		System.out.println("Super play()");
	}
}