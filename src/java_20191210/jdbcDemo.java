package java_20191210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver"); // forname 메모리에 올리는 작업,
														// 1.드라이버 파일을 메모리에
														// 로드시켜주는
														// 작업
			// org.mariadb.jdbc.Driver 클래스를 메모리에 로딩한다.
			System.out.println("드라이브 로드 성공");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection(
					// 2. 데이터베이스와 연결을 시도한다.
					"jdbc:mysql://localhost:3306/acorn?autoReconnect=true", // url
					"acorn12", // user
					"acorn12"); // password
			System.out.println("데이터 베이스 연결 성공");

			StringBuffer sql = new StringBuffer(); // 객체연결할수있는 스트링 버퍼 / 스트링은
													// 문자열을 조작할떄 사용

			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(?,?,?)");
			// 3. sql문을 전송할 수 있는 PreparedStatment 객체를 생성한다. ?(바인딩변수)는 항상 밸류에만 널을수있다.

			pstmt = con.prepareStatement(sql.toString()); // tostring 숫자를 문자열로
															// 바꿔주는 함수
			
			// 4. 바인딩 변수(?)를 설정한다.
			int index = 0;
			pstmt.setInt(++index, 60);
			pstmt.setString(++index, "ANALYSIS");
			pstmt.setString(++index, "LA");

			// 5. sql문을 전송한다.

			int result = pstmt.executeUpdate(); // insert, update, delete (dml)

			System.out.println("갱신된 행의 수 : " + result);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}