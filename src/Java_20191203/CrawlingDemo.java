package Java_20191203;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingDemo {
	public static void main(String[] args) {
		String url = "http://www.imbc.com/";
		// HTML문서 전체를 관리하기 위한 객체
		Document doc = null;

		try {
			doc = Jsoup.connect(url).get();
			System.out.println("성공");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements elements = doc.select(".con-wrap.notice-wrap");
		Elements titleElements = elements.select("h3");
		String noticeTitle = titleElements.text();
		System.out.println(noticeTitle);

		Elements liElements = elements.select(".notice-list ul li");

		for (int i = 0; i < liElements.size(); i++) {
			Element liElement = liElements.get(i);
			String text = liElement.text();
			System.out.println(text);
		}

	}
}
// 외부 라이브러리 다운 받는 법 : 폴더 우측클릭 => Build Path => configure build path => library
// => jar파일 add => 확인
// 클래스는 주소 앞에 .을 붙여준다.(ex 공지사항 con-wrap . notice-wrap 앞에 점)