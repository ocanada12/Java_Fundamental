package Java_20191205.multicast.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;

public class MulticastServerThread implements Runnable {
	private Socket socket;
	private ArrayList<MulticastServerThread> list;
	private BufferedWriter bw;

	public MulticastServerThread(Socket socket, ArrayList<MulticastServerThread> list) {
		this.socket = socket;
		this.list = list;
	}

	@Override
	public void run() {
		try {
			// InputStream in = socket.getInputStream();
			// InputStreamReader isr = new
			// InputStreamReader(socket.getInputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// OutputStream out = socket.getOutputStream();
			// OutputStreamWriter osw = new
			// OutputStreamWriter(socket.getOutputStream());
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			boolean isStop = false;
			while (!isStop) {
				String readLine = br.readLine();
				System.out.println(readLine);
				if (readLine.equals("exit")) {
					isStop = true;
					sendMessage(readLine);
				} else {
					broadCast(readLine);
				}

			}
			list.remove(this);
			System.out.println("클라이언트가 정상적으로 종료했습니다...");

		} catch (IOException e) {
			list.remove(this);
			System.err.println("클라이언트가 비정상적으로 종료했습니다...");
		}

	}

	public void broadCast(String message) throws IOException {
		for (MulticastServerThread mst : list) {
			mst.sendMessage(message);

		}
	}

	public void sendMessage(String message) throws IOException {
		bw.write(message);
		bw.newLine();
		bw.flush();
	}
}
