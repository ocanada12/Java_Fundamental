package homework;

public class Homework2 {
	public static void main(String[] args) {
		// 문자 reverse 하기
		// 1.input "abcd" => "dcba"
		// 2.input "abcde" => "edcba"

		String a = "abcd"; // "abcde"
		char[] ch = a.toCharArray();

		for (int i = 0; i < ch.length / 2; i++) {
			char temp = ch[i];
			ch[i] = ch[ch.length - i - 1];
			ch[ch.length - i - 1] = temp;
		}

		System.out.println(ch); //System.out.println(new string(ch))

		// 포문 돌리기 전체길이 나누기 2렝스 하면됨

		// 1~100까지 소수를 구하시오
		for (int i = 2; i <= 100; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				    }
				}
				if (count == 0) {
					System.out.print(i + " ");
				}
			}
		}
	}

