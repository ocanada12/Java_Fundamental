package java_20191210.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java_20191210.dto.DeptDto;

public class DeptDao {

	static { // 스태틱 초기화는 스태틱 변수를 처음 초기화하거나 다른 스태틱메서드 호출할때 쓰이는것

		try {
			Class.forName("org.mariadb.jdbc.Driver"); // forname 메모리에 올리는 작업,
														// 1.드라이버 파일을 메모리에
														// 로드시켜주는
														// 작업
			// org.mariadb.jdbc.Driver 클래스를 메모리에 로딩한다.

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static DeptDao single; // 그냥 변수 선언한것(싱글톤이어서)

	private DeptDao() {
	} // 생성자

	public static DeptDao getInstance() { // 객체 생성
		if (single == null) {
			single = new DeptDao();
			
		}
		return single;
	}

	public boolean insert(DeptDto dto) { // insert 되면 트루 안되면 폴스
		boolean isSuccess = false;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection(
					// 2. 데이터베이스와 연결을 시도한다.
					"jdbc:mysql://localhost:3306/acorn?autoReconnect=true", // url
					"acorn12", // user
					"acorn12"); // password // 클래스파일을 디컴파일 하면 자바 파일로 바뀜

			StringBuffer sql = new StringBuffer(); // 객체연결할수있는 스트링 버퍼 / 스트링은
													// 문자열을 조작할떄 사용

			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(?,?,?)");
			// 3. sql문을 전송할 수 있는 PreparedStatment 객체를 생성한다. ?(바인딩변수)는 항상 밸류에만
			// 널을수있다.

			pstmt = con.prepareStatement(sql.toString()); // tostring 숫자를 문자열로
															// 바꿔주는 함수

			// 4. 바인딩 변수(?)를 설정한다.
			int index = 0;
			pstmt.setInt(++index, dto.getNo());
			pstmt.setString(++index, dto.getName());
			pstmt.setString(++index, dto.getLoc());

			// 5. sql문을 전송한다.

			pstmt.executeUpdate(); // insert, update, delete (dml)

			isSuccess = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {

				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return isSuccess;
	}

	public boolean update(DeptDto dto) { // insert 되면 트루 안되면 폴스
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstm = null;

		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acorn?autoReconnect=true", "acorn12",
					"acorn12");

			StringBuffer sql = new StringBuffer();

			sql.append("UPDATE dept ");
			sql.append("SET dname = ?, loc = ? ");
			sql.append("WHERE deptno = ?");

			pstm = con.prepareStatement(sql.toString());

			int index = 0;
			pstm.setString(++index, dto.getName());
			pstm.setString(++index, dto.getLoc());
			pstm.setInt(++index, dto.getNo());

			pstm.executeUpdate();

			isSuccess = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {

				if (pstm != null)
					pstm.close();
				if (con != null)
					con.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return isSuccess;
	}

	public boolean delete(int deptNo) { // insert 되면 트루 안되면 폴스
		boolean isSuccess = false;

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
			ptsd.setInt(1, deptNo);

			ptsd.executeUpdate();

			isSuccess = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {

				if (ptsd != null)
					ptsd.close();
				if (con != null)
					con.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return isSuccess;
	}

	public ArrayList<DeptDto> select() {
		ArrayList<DeptDto> list = new ArrayList<DeptDto>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/acorn", "acorn12", "acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT deptno, dname, loc ");
			sql.append("FROM dept ");
			sql.append("ORDER BY deptno");

			pstmt = con.prepareStatement(sql.toString());

			rs = pstmt.executeQuery(); // select문일 떄 sql문을 전송하는 메서드

			while (rs.next()) {
				int index = 0;
				int deptno = rs.getInt(++index);
				String dname = rs.getString(++index);
				String loc = rs.getString(++index);
				list.add(new DeptDto(deptno, dname, loc));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	public DeptDto select(int deptNo) {
		DeptDto dto = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/acorn", "acorn12", "acorn12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT deptno, dname, loc ");
			sql.append("FROM dept ");
			sql.append("where deptno = ?");

			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setInt(++index, deptNo);

			rs = pstmt.executeQuery(); // select문일 떄 sql문을 전송하는 메서드

			if (rs.next()) {
				index = 0;
				int deptno = rs.getInt(++index);
				String dname = rs.getString(++index);
				String loc = rs.getString(++index);
				dto = new DeptDto(deptno, dname, loc);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return dto;
	}
}
