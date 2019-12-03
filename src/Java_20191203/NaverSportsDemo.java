package Java_20191203;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverSportsDemo {
	public static void main(String[] args) {
		// String url = "https://sports.news.naver.com/index.nhn";
		String url = "https://m.sports.naver.com/";

		Document doc = null;
		Document doc2 = null;

		try {
			doc = Jsoup.connect(url).get();
			System.out.println("성공");
		} catch (IOException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements elements = doc.select("#mostCommentedNewsList");

		Elements liElements = elements.select("ul li");

		for (int i = 0; i < liElements.size(); i++) {
			Element liElement = liElements.get(i);
			String href = liElement.select("a").attr("abs:href");
			try {
				doc2 = Jsoup.connect(href).get();
			} catch (IOException e) { // TODO
				// Auto-generated catch block e.printStackTrace(); }

				Elements ele = doc2.select("#newsEndContents");
				String content = ele.text();
				String title = liElement.text();
				System.out.println(title + ":" + content);

			}
		}
	}

}
// class가 아니라 id사용할떄는 앞에 점 대신 #사용하면 됨