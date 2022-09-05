package code15_04;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println("処理開始");
		for(int i  = 0; i < 30000000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		
		System.out.println("処理終了");
	}
}
