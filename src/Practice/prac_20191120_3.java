package Practice;

// 이중 for문으로 별피라미드 만들기

public class prac_20191120_3 {
public static void main(String[] args) {
for (int i = 0; i < 100; i++) {
	for (int j = 0; j < i; j++) {
		System.out.printf("*");
	}
	System.out.println("");

}
for (int i = 0; i < 100; i++) {
	for (int j = 0; j < 100-i; j++) {
		System.out.printf("*");
	}
	System.out.println("");
}
}
}
