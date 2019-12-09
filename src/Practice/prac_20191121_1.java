package Practice;

public class prac_20191121_1 {
	public static void main(String[] args) {
		String[] a = { "한", "김", "장", "박", "우", "황", "창", "격", "미", "도", "레" };
		for (String v : a) {
		}
		String[] b = new String[20];
		
		System.arraycopy(a, 0, b, 2, 4);
		
		for(String d : b){
			System.out.println(d);
		}
	}
}