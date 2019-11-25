package java_20191121;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 달력만들기 1. 1년 1월 1일은 월요일 2. 1년 365일, 윤년은 366일 - 2월 29일 3. 윤년은 4년마다 발생하고
		 * 그중에서 100배수는 제외하고 400의 배수는 제외하지 않는다. 4. 2019년 12월 25일 무슨요일일까?
		 */
		int year = 2019;
		int month = 12;
		int day = 25;
		String message = null;
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int Preyear = year - 1;
		int Premonth = month - 1;
		int totalCount = 0;

		int sum = 0;
		for (int i = 0; i < monthArray.length - 13 + month; i++) {
			sum += monthArray[i];
		}
		
		// 2018년까지 총일 수 구하기
		totalCount = Preyear * 365 + Preyear / 4 - Preyear / 100 + Preyear / 400;
		
		// 2019년도가 윤년인지 판단한다.
		boolean isLeafYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

		//2019년도가 윤년이면 2월 29일로 변경한다.
		if (isLeafYear){
			monthArray[1] = 29;
		}

		for (int i = 0; i < Premonth; i++) {
			totalCount += monthArray[i];
		}
		
		totalCount += day;
		
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
}
