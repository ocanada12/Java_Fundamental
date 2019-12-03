package Java_20191203;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CoinMarketCapCrawlingDemo {
	public static void main(String[] args) throws IOException {

		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;

		String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20171101&end=20191203";
		Document doc = null;

		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Elements elements = doc.select(".cmc-table__table-wrapper-outer table tbody tr"); // 이거 약간 모르겠

		System.out.println("Date\t\t\tOpen\t\tHigh\t\tLow\t\tClose\t\tVolume\t\tCap");   // 모니터 출력

		// c:\dev\io\2019\12\crawling.txt => 저장하기
		fw = new FileWriter("C:\\dev\\io\\2019\\12\\crawling.txt");
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw, true);  
		pw.println("Date\t\tOpen\t\tHigh\t\tLow\t\tClose\t\tVolume\t\tCap%n");  // 파일 출력
		for (int i = 0; i < elements.size(); i++) {
			Element trElement = elements.get(i);
			String date = trElement.child(0).text();
			String open = trElement.child(1).text();
			String high = trElement.child(2).text();
			String low = trElement.child(3).text();
			String close = trElement.child(4).text();
			String volume = trElement.child(5).text();
			String cap = trElement.child(6).text();
			String format = String.format("%s\t\t%s\t%s\t%s\t%s\t%s\t%s%n", date, open, high, low, close, volume, cap); // readLine이라고 할수있음.
			System.out.println(format);
			pw.print(format);    // 파일 출력
		}
	}
} //1바이트를 2바이트로 바꿔주는게 인풋스트림리더

// 여러가지 자료들을 긁어와서 분석하는 방법을 알아야됨

// 데이터 분석하고 머신러닝, 딥러닝하려면 파이선

// 경력직으로 들어가는게 들어가기 훨씬 쉬움

// 지식은 배워두면 좋다. 

// 노력을 해서 열심히 하다보면 길이 보이게 되있다.

// 여기서 열심히 하면 for문 

// 네트웤은 조금 빨리 나가도록 하겠습니다. 2일정도할것

// tcp ip 통신 하려고 나온 자바

// 네트웤도 사실은 io코딩

// 키보드 입력한것을 파일로 저장하는것 연습 해보기
