package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Utility {
	public static boolean isCopy(String fromFile, String toFile) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		boolean isSuccess = false;

		try {
			fis = new FileInputStream(fromFile);
			fos = new FileOutputStream(toFile);
			byte[] readBytes = new byte[1024 * 20];
			int readByteCount = 0;

			while ((readByteCount = fis.read(readBytes)) != -1) {

				fos.write(readBytes, 0, readByteCount);
			}
			isSuccess = true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return isSuccess;
	}

	public static String getDate(String pattern) {
		return new SimpleDateFormat(pattern).format(Calendar.getInstance().getTime());
	}
}


// 개발자의 자세 oop마인드 계속 재사용하고 똑같은걸
// 회사 솔루션이 될수
// 삼성에서 프레임워크 단점 보완해서 애니프레임워크 
// 전자정보 프레임워크 
// 계속해서 멍청한짓을 하지말앙야지 실수도 해보고 해야됨 




