package Java_20191204;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketScanDemo {
	public static void main(String[] args) {
		Socket socket = null;
		for (int i = 1; i <= 1024; i++) {
			// Socket 객체가 생성되었다는 의미는 host, port 로 통신할 수 있다는 의미
			// 이야기고 이는 해당host에 port번호를 사용하고 있다는 이야기임
			try {
				socket = new Socket("13.209.180.253", i);
				System.out.println(i + "번호를 사용하고 있습니다.");
			} catch (UnknownHostException e) {
				System.err.println("호스트가 존재하지 않습니다.");
			} catch (IOException e) {
				System.err.println(i + "번호를 사용하고 있지 않습니다.");
			}
		}
	}
}
// 접속을 하고 난 다음에 메세지를 보내는 것은 통신규약에 따라 보내는 것 
// 소켓을 이용해서 포트가 열려있는지 안열려있는지 확인할수있다.

