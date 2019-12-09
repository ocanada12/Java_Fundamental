package Practice;

public class prac_20191121_2 {
public static void main(String[] args) {
	int[] lotto = new int[6];
	
	for (int i = 0; i < lotto.length; i++) {
		double random = Math.random();
		int temp = (int)(random*45)+1;
		lotto[i] = temp;
		for (int j = 0; j < i; j++) {
			if(lotto[j] == temp){
				i--;
				break;
			}
		}
		}
	for (int i = 0; i < lotto.length; i++) {
		for (int j = 0; j < lotto.length; j++) {
			
		}
	}
	for(int a : lotto){
		System.out.print(a + "\t");
	}	
}
}
