package renshu02_01;

public class Main {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		String ans = "x+yは、" + x + y;
		
		System.out.println(ans);
		
		//下記のように修正する
		
		int x2 = 5;
		int y2 = 10;
		String ans2 = "x+yは、" + (x2 + y2);
		
		System.out.println(ans2);

	}

}
