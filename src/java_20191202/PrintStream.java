package java_20191202;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.PrintStream;;

public class PrintStream {
	public static void main(String[] args) {
//		PrintStream ps = System.out;// Destination을 출력장치로 연결하겠다는 의미
//		ps.println("Hello world!!");

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream("c:\\dev\\io\\2019\\12\\pdf.zip");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("c:\\dev\\io\\2019\\12\\pdf-1.zip");
			bos = new BufferedOutputStream(fos);

//			ps1 = new PrintStream(bos,true); //Destination을 파일로 연결하겠다는 의미
			int readByte = 0;
			while((readByte = bis.read()) != -1){
//				ps1.write(readByte);
			}

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
//				if (ps1 != null)
					bos.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}