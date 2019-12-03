package Java_20191203;

// 하고자 하는 스레드를 전체를 와일로 묶은 다음에 슬립 설정만해주시면 됩니다.
// 쓰레드를 잘활용하면 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingThread extends Thread {
	private String fileName;

	public CrawlingThread(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void run() {
		int count = 0;
		while (true) {
			count++;
			String name = fileName.substring(0, fileName.lastIndexOf(".")); // 파일이름
			String extention = fileName.substring(fileName.lastIndexOf("."));
			String fileName2 = name + count + extention;

			Calendar c = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			String endDate = sdf.format(c.getTime()); // 칼렌다에서

			FileWriter fw = null;
			BufferedWriter bw = null;
			PrintWriter pw = null;

			String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20171101&end=" + endDate;
			Document doc = null;

			try {
				doc = Jsoup.connect(url).get();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Elements elements = doc.select(".cmc-table__table-wrapper-outer table tbody tr"); // 이거
																								// 약간
																								// 모르겠

			System.out.println("Date\t\t\tOpen\t\tHigh\t\tLow\t\tClose\t\tVolume\t\tCap"); // 모니터
																							// 출력

			// c:\dev\io\2019\12\crawling.txt => 저장하기
			try {
				fw = new FileWriter("C:\\dev\\io\\2019\\12\\" + fileName);
				bw = new BufferedWriter(fw);
				pw = new PrintWriter(bw, true);
				pw.println("Date\t\tOpen\t\tHigh\t\tLow\t\tClose\t\tVolume\t\tCap%n"); // 파일
																						// 출력
				for (int i = 0; i < elements.size(); i++) {
					Element trElement = elements.get(i);
					String date = trElement.child(0).text();
					String open = trElement.child(1).text();
					String high = trElement.child(2).text();
					String low = trElement.child(3).text();
					String close = trElement.child(4).text();
					String volume = trElement.child(5).text();
					String cap = trElement.child(6).text();
					String format = String.format("%s\t\t%s\t%s\t%s\t%s\t%s\t%s%n", date, open, high, low, close,
							volume, cap); // readLine이라고 할수있음.
					System.out.println(format);
					pw.print(format); // 파일 출력
				}
				;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (pw != null)
					pw.close();
			}
			try {
				Thread.sleep(1000 * 10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
