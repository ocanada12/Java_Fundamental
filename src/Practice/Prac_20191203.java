package Practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Prac_20191203 {
	public static void main(String[] args) {
		System.out.print("입력하세요>");
		InputStream in = System.in;
		InputStreamReader isr = null;
		FileWriter fw =null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
				
		try {
			isr  = new InputStreamReader(in);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw, true);  
			fw = new FileWriter("C:\\dev\\io\\2019\\12\\dsfsd.txt");
			String readLine = null;
			pw.println(readLine);
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//네트웤이 나오면 티어라는 개념이 나옴
	}
	
}
