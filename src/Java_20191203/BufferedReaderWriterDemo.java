package Java_20191203;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterDemo {
public static void main(String[] args) {
	FileReader fr =null;
	FileWriter fw =null;
	BufferedReader br =null;
	BufferedWriter bw =null;

	try {
		fr = new FileReader("c:\\dev\\io\\2019\\12\\test.txt");
		br = new BufferedReader(fr);

		fw = new FileWriter("c:\\dev\\io\\2019\\12\\test-copy2.txt");
		bw = new BufferedWriter(fw);

		
		String readLine = null;
		while((readLine = br.readLine()) != null){
			bw.write(readLine);
			bw.newLine();
		}
		bw.flush();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try {
				if(fr != null)fr.close();
				if(br != null)br.close();
				// if(fw != null)fw.close();
				if(bw != null)bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
}
}
// 리드라인 계행 포함이 안되있음. 
// 윈도우는 역슬래시엔 리눅스에는 역슬래시알
// 그냥 newLine쓰면됨
// 버퍼는 플러시를 넣줘야 안전함
// 프린트라이터는 프린트엘엔이 있음