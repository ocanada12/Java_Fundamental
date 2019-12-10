package java_20191210;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
        
public class JdbcDeleteDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.maridb.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection con = null;
		PreparedStatement ptsd = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acorn?autoReconnect=true", "acorn12",
					"acorn12");

			StringBuffer a = new StringBuffer();
			a.append("DELETE ");
			a.append("FROM dept ");
			a.append("WHERE deptno = ? ");

			ptsd = con.prepareStatement(a.toString());
			ptsd.setInt(1, 50);

			int result = ptsd.executeUpdate();

			System.out.println("삭제된 행의 수 : " + result);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				
				if (ptsd != null) ptsd.close();
				if (con != null) con.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
