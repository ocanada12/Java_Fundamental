package java_20191202;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class BufferedInOutPutStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream("c:\\dev\\io\\2019\\12\\pdf.zip");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("c:\\dev\\io\\2019\\12\\pdf-1.zip");
			bos = new BufferedOutputStream(fos);

			/*
			 * int readByte = 0; long start = System.currentTimeMillis();
			 * 
			 * while((readByte = bis.read()) != -1){ bos.write(readByte); }
			 * 
			 * bos.flush(); //마지막에 화장실물내리는것
			 * 
			 * long end = System.currentTimeMillis();
			 * 
			 * System.out.printf("경과시간 : %d%n", end-start);
			 * 
			 */
			// 한바이트 읽고 쓰는 속도가 빠른거지 배열로 코딩하면 더 빠르다.

			int readByteCount = 0;
			byte[] readBytes = new byte[1024 * 8];
			long start = System.currentTimeMillis();
			while ((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteCount);
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d", end - start);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (bis != null)
					bis.close();
				if (fos != null)
					fos.close();
				if (bos != null)
					bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
// 플러시 작업을 해줘야함 마지막에