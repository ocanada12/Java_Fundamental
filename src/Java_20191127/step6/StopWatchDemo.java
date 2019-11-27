package Java_20191127.step6;

//1. 모든 클래스의 Encapsulation
//2. 메인 클래스의 Java Reflection 추가 

public class StopWatchDemo {
	public void execute(StopWatch s) {
		s.run();
	}
	//추상클래스에 대한 폴리모라이징
	
	public static void main(String[] args) throws Exception{
		String input = args[0];
		String className = "java_20191127.step6." + input;
		StopWatch s = (StopWatch)Class.forName(className).newInstance();
		StopWatchDemo swd = new StopWatchDemo();
		swd.execute(s);
	}
}

