package homework;

public class Homework2 {
public static void main(String[] args) {
	//문자 reverse 하기
	//1.input "abcd" => "dcba"
	//2.input "abcde" => "edcba"
	
	String input = "abcd"; // "abcde"	
	char[] ch = input.toCharArray();
	for (int i = 0; i <= ch.length/2-1; i++) {
			char temp;
			temp=ch[0];
			ch[i]=ch[ch.length-i-1];
			System.out.print(ch);
			}
	

	
	
	//포문 돌리기 전체길이 나누기 2렝스 하면됨
	
	//1~100까지 소수를 구하시오
	for (int i = 1; i <= 100; i++) {
		for (int j = 2; j <= i; j++) {
			if ( i % j == 0 && i != j ){ break;}
			else if( i == j ){
			System.out.println(i);}
	}	
	}
}
}
