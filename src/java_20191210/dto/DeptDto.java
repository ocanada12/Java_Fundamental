package java_20191210.dto;

public class DeptDto {
	private int no; // 자바는 디테일한 이름을 넣지 않음.
	private String name; // 데이터 베이스는 칼럼명이 중복됬을때 조인할때 문제 생김.
	private String loc; // 그래서 칼럼명에 테이블명을 포함한 이름을 넣게 되있음. 하지만 자바는 아님.

	public DeptDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeptDto(int no, String name, String loc) {
		super();
		this.no = no;
		this.name = name;
		this.loc = loc;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}
