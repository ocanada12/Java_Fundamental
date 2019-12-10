package java_20191210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcUpdateDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");

			System.out.println("드라어버 로드 성공");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection con = null;
		PreparedStatement pstm = null;

		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acorn?autoReconnect=true", "acorn12",
					"acorn12");
			System.out.println("데이터베이스 접속 성공");

			StringBuffer sql = new StringBuffer();

			sql.append("UPDATE dept ");
			sql.append("SET dname = ?, loc = ? ");
			sql.append("WHERE deptno = ?");

			pstm = con.prepareStatement(sql.toString());
			pstm.setString(1, "MINING");
			pstm.setString(2, "SILVAL");
			pstm.setInt(3, 60);

			int result = pstm.executeUpdate();

			System.out.println("갱신된 행의 수 :" + result);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
