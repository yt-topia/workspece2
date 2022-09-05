package code04_07;

public class Main {

	public static void main(String[] args) {
		int [] scores = new int[5];
		System.out.println(scores[0]);
		
		String[] scores1 = new String[5];
		System.out.println("文字列" + scores1[0]);
		
		boolean[] scores2 = new boolean[5];
		System.out.println("真偽" + scores2[0]);
		
		//char型は、コンピュータ上では数値で処理される型なので、以下の場合初期値は空白となる。
		char [] scores3 = new char[5];
		System.out.println("文字" + scores3[0]);
		
		//添え字を指定しないでおくと参照先が表示されるパターン
		System.out.println(scores);

	}

}
