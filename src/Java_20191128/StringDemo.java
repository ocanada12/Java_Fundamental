package Java_20191128;

public class StringDemo {
	public static void main(String[] args) {
		String str = "111111-111111";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		str = str.concat("abcd"); // str + "abcd"와 같다.
		System.out.println(str);

		String fileName = "abc.zip";
		if (fileName.endsWith("zip")) {
			System.out.println("zip파일 입니다.");
		} else if (fileName.endsWith("ppt")) {
			System.out.println("ppt파일 입니다.");
		}
		String uri = "artist/index.jsp";
		if (uri.startsWith("artist")) {
			System.out.println("작가 페이지 입니다.");
		} else if (uri.startsWith("exhibition")) {
			System.out.println("전시 페이지입니다.");
		}
		System.out.println("abc".equalsIgnoreCase("ABc")); // 대소문자를 구분하지 않고 문자를
															// 비교한다.

		String s1 = "a"; // 1바이트
		String s2 = "김";
		System.out.println(s1.getBytes().length);
		System.out.println(s2.getBytes().length);
		// str = "111111-111111"
		System.out.println(str.indexOf("-"));
		fileName = "abc.bde.fafb.asdf.ppt";
		System.out.println(fileName.lastIndexOf("."));
		// 파잉이 유동적으로 바뀜 파일이름과 확장자를 구분하려면 앞에서 찾는 indexof 로는 안됨
		// last indexof 뒤에서부터찾음(파일이름과 확장자 찾을때)

		String first = str.substring(0, str.indexOf("-")); // 0은 포함되고 str.~은
															// 포함안됨
		String second = str.substring(str.indexOf("-") + 1);
		System.out.println(first);
		System.out.println(second);

		String content = "abc\nabc\nabc\nabc";
		System.out.println(content); // java.lang.String@a1sdb1
		content = content.replaceAll("\n", "<br>");
		System.out.println(content.toString());
		
		s1 = "abc";
		s2 = "abc ";
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s1.trim().equals(s2.trim())); // 중간공백 제거 아님
		// String.valueOf() => primitive data type => String
		s1 = String.valueOf(100); // 1+"";
		
		String phone = "010-3024-1703-dsfdsf-sdf";
		String[] temp = phone.split("-");
		for (String string : temp) {
			System.out.println(string);			
		}
		
		str = String.format("%3$,10.2f %2$,10.2f %1$,10.2f", 1000.234,200000.123,300000.456);
		System.out.println(str);
	
		// 결과가 문자로 나옴
	
		System.out.printf("%d%n",100);
		System.out.format("%d%n",100);
		
	
		

		
		
		
		
		
		
		
		

		
	}
}
