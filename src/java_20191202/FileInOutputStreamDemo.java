package java_20191202;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null; // //객체생성 읽고쓰고 닫고

		try {
			fis = new FileInputStream("c:\\dev\\io\\2019\\12\\jdk.exe"); // 소스
			fos = new FileOutputStream("c:\\dev\\io\\2019\\12\\jdk-2.exe"); // 목적지
			// int readByte = 0;
			// fis.read() : 한 바이트 읽어서 반환한다. 더 이상 읽을 바이트가 없으면 -1 반환
			// while ((readByte = fis.read()) != -1) {
			// fos.write() : 한 바이트 쓰기
			// fos.write(readByte);
			// }
			
			byte[] readBytes = new byte[1024*20];
			int readByteCount = 0;
			// fis.read(readBytes) : 1024 바이트로 읽어서 readByte에 저장하고
			// 읽은 바이트수를 반환한다.
			long start = System.currentTimeMillis();
			while ((readByteCount = fis.read(readBytes)) != -1) {
				// fos.write(readBytes,0,readByteCount) : readBytes 바이트
				// 배열에 있는 데이터를 출력하되, 처음(0)부터,readByteCount만큼 출력
				fos.write(readBytes, 0, readByteCount);
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d",end-start);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}