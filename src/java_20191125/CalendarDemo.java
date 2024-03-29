package java_20191125;

public class CalendarDemo {
	private int year;
	private int month;
	private int day;
	private int totalCount;
	int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };;

	public CalendarDemo(int y) {
		// year = y;
		this(y, 0, 0);
		System.out.println(year);

	}

	public CalendarDemo(int y, int m) {
		// year = y;
		// month = m;
		this(y, m, 0);
	}

	// 다른 생성자가 한개라도 없으면 콤파일러 가 자동적으로 생성해줌
	// 매개변수 3개 짜리 생성자 (클래스 이름과 동일하며 반환값(void)이 없음)
	public CalendarDemo(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		getTotalCount();
	}

	public void set(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
		getTotalCount();
	}

	public int getTotalCount() {
		int Preyear = year - 1;
		int Premonth = month - 1;
		// int totalCount = 0;

		for (int i = 0; i < monthArray.length - 13 + month; i++) {
		}

		// 2018년까지 총일 수 구하기
		totalCount = Preyear * 365 + Preyear / 4 - Preyear / 100 + Preyear / 400;

		// 2019년도가 윤년인지 판단한다.
		boolean isLeafYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

		// 2019년도가 윤년이면 2월 29일로 변경한다.
		if (isLeafYear) {
			monthArray[1] = 29;
		}

		for (int i = 0; i < Premonth; i++) {
			totalCount += monthArray[i];
		}

		totalCount += day;

		return totalCount;
	}

	public void print() {
		String message = null;
		int duck = totalCount % 7;
		if (duck == 0) {
			message = "일요일";
		} else if (duck == 1) {
			message = "월요일";
		} else if (duck == 2) {
			message = "화요일";
		} else if (duck == 3) {
			message = "수요일";
		} else if (duck == 4) {
			message = "목요일";
		} else if (duck == 5) {
			message = "금요일";
		} else {
			message = "토요일";
		}
		System.out.printf("%d년 %d월 %d일은  %s 입니다.", year, month, day, message);

	}

	/*
	 * public CalendarDemo(){
	 * 
	 * }
	 */

	public static void main(String[] args) {
		CalendarDemo c = new CalendarDemo(2019, 12, 25);
		// c.set(2019, 12, 25);
		// c.getTotalCount();
		c.print();
		// year, month, day
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				total += i;
			}
			System.out.print(total);
		}

	}
}

// 추상클래스의 다형성 인터페이스의 다형성 내일 가장중요