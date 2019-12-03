package Java_20191203;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader("c:\\dev\\io\\2019\\12\\test.txt");
			fw = new FileWriter("c:\\dev\\io\\2019\\12\\test-copy.txt");
			/*
			 * int readChar = 0; while((readChar = fr.read()) != -1){
			 * System.out.println((char)readChar); fw.write(readChar); }
			 */
			char[] readChars = new char[100000];
			int readCharCount = 0;
			while ((readCharCount = fr.read(readChars)) != -1) {
				// System.out.println(new String(readChars, 0, readCharCount));
				// fw.write(readChars, 0, readCharCount);
				fw.write(new String(readChars, 0, readCharCount));
				
			}

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();

		} finally {

			try {
				if (fr != null)
					fr.close();
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}