package java_20191202;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {

	public static void main(String[] args) {
		File f1 = new File("c:\\dev\\io\\2019\\12"); // 가장 많이 사용
		boolean isSuccess = f1.mkdirs(); // 메서드화 시키면 좋음
		System.out.println(isSuccess);

		File f2 = new File(f1, "jdk-11.0.3_windows-x64_bin.exe");
		long fileSize = f2.length() / 1024;
		System.out.println(fileSize);
		long lastModified = f2.lastModified();

		Calendar c = Calendar.getInstance();
		// 추상클래스 연월일을 뽑아낼수있음.
		// 지금 시스템에 있는 연월일 2019년 12월 2일 시분초까지
		c.setTimeInMillis(lastModified);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DATE);
		System.out.printf("%d년 %d월 %d일 %n", year, month, day);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd a hh:mm:ss E요일");
		String date = sdf.format(c.getTime());
		System.out.println(date);

		File f3 = new File("c:\\");
		// list() : c드라이브에 있는 모든 파일과 디렉토리를 String[] 배열로 변환
		String[] list = f3.list();
		for (String temp : list) {
			File f4 = new File(f3, temp);
			if (f4.isDirectory()) {
				System.out.println("디렉토리 : " + temp);
			} else if (f4.isFile()) {
				System.out.println("파일 : " + temp);
			} else {
				System.out.println("? : " + temp);
			}
		}

		File f5 = new File(f1, "jdk.exe");
		f2.renameTo(f5);

		// 파일클래스를 통해서 이름바꾸고 디렉토리생성하는정도

		File f6 = new File(f1, "a.txt");
		try {
			f6.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(f6.getName());
		System.out.println(f6.getPath());
		System.out.println(f6.getParent());

		String extention = f6.getName().substring(f6.getName().lastIndexOf("."));
		System.out.println(extention);

		File f7 = new File(f1, System.currentTimeMillis() + extention);

		f6.renameTo(f7);
		f7.delete();                            //  디렉토리 만드는거, 이름바꾸는거, 삭제하는거, 사이즈 확인하는거
	}
}

// 단순히 연월일 뽑을땐 칼렌다가 편하고 오전오후 등 뽑는것은 심플대이터포맷
// 칼렌다 클래스 이용해서 칼렌다 객체를 처리
// 시스템. 커렅느 타임