package Java_20191128;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("test");
		StringBuffer s2 = new StringBuffer("test");
		//StringBuffer 클래스는 Object의 equals()메서드를 overriding 하지
		//않았기 때문에 StringBuffer의 equals()를 사용하면 false가 반환된다.
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1);
		
		String s3 = s1.toString();
		String s4 = s2.toString();
		System.out.println(s3.equals(s4));
		
		StringBuffer sq1 = new StringBuffer();
		sq1.append("select name, age ");
		sq1.append("from member");
		sq1.append("where name = '성영한' ");
		sq1.append("order by name desc");
		System.out.println(sq1);
		
		//sq1의 모든 문자열 지우기
		sq1.setLength(0);
		sq1.append("select no, writer ");
		sq1.append("from board");
		
		System.out.println(sq1);
		
		
		
	}
}
