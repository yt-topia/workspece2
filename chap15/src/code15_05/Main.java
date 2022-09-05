package code15_05;

public class Main {

	public static void main(String[] args) {
		isValidPlayerName2 vp = new isValidPlayerName2();
		boolean b = vp.isValidPlayerName("MINATO223");
		if(b == true) {
			System.out.println("正しい名前です");
		}else {
			System.out.println("不正な入力値です");
		}
	}
}
