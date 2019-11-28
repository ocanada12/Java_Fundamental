package Java_20191128;

public class Member {
	private String id;
	private String name;

	public Member(String id, String name) {// 생성자 만들기 : 알트 시프트 에스 오
		super();
		this.id = id;
		this.name = name;
	}

	// 세터 게터 : 알트 시프트 에스 알
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}