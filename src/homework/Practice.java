package homework;

import java_20191120.ForDemo;

public class Practice {
	public static void main(String[] args) {
		String original = "abcdefghij";
		char[] ch = original.toCharArray();
		for (int i = 0; i <= ch.length / 2; i++) {
			char temp = ch[i];
			ch[i] = ch[ch.length - 1 - i];
			ch[ch.length - 1 - i] = temp;
		}
		System.out.println(ch);

		for (int i = 2; i <= 100; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(i + " ");
			}
		}
		int total = 0;
		for (int i = 0; i < 100; i++) {
			if(i%2==1){
				total += i;
			}
			
			System.out.println(total);
		}
	}

}
