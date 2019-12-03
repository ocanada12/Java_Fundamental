package homework;

import java.util.Scanner;

import java_20191125.CalendarDemo;

public class Homework3 {
	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;

	private int year;
	private static int month;
	private int day;
	private static int totalCount;
	int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getTotalCount() {
		int Preyear = year - 1;
		int Premonth = month - 1;
		for (int i = 0; i < monthArray.length - 13 + month; i++) {

			totalCount = Preyear * 365 + Preyear / 4 - Preyear / 100 + Preyear / 400;

			boolean isLeafYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

			if (isLeafYear) {
				monthArray[1] = 29;
			}

			for (int g = 0; i < Premonth; i++) {
				totalCount += monthArray[i];
			}

			totalCount += day;
		}
		return totalCount;
	}

	public Homework3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void print() {
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("&&&                                   &&&");
		System.out.println("&&&      날짜를 입력하세요       &&&");
		System.out.println("&&&          (연, 월, 일)             &&&");
		System.out.println("&&&                                   &&&");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
	}

	public String console(String msg) {
		System.out.println(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
			
	// 날짜구하고
	// 날짜 불러오고
	// 달력형태
	// 스캐너 하고
	// 날짜 별 할당
	//

	// 연월일을 치면 요일 나오는 메서드
	// (for 루프) , for 루프, 계행 , for 루프, 계행 .......
	// 매개변수 3개짜리 연 월 일 요일
	// 매개변수 2개짜리 연 월 ( 달력 )
	// 매개변수 1개짜리 연 ( 달력 )

	public static void main(String[] args) {
		System.out.println(totalCount);
		Homework3 c = new Homework3();
		c.print();
		c.console("(연,월,일) 입력하세요 => ");

		for (int z = 1; z <= 12; z++) {
			
			int month = z;

			System.out.printf("%n%n*** %d월 달력 ***%n%n일\t월\t화\t수\t목\t금\t토%n%n", month);

			int a = 1;
			int b = 31;

			for (int i = 1; i < a; i++) {
				System.out.print("\t");
			}
			int cnt = a - 1;
			for (int j = 1; j <= b; j++) {
				System.out.print(j + "\t");
				cnt++;
				if (cnt % 7 == 0) {
					cnt = 0;
					System.out.println("\n");

				}
			}
		}
	}

	public Homework3(int year, int month, int day, int totalCount, int[] monthArray) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.totalCount = totalCount;
		this.monthArray = monthArray;
	}
}

// 회원관리 프로그램 ArrayList
																															