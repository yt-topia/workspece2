package code15_10;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		//ここで何らかの時間がかかる処理
		StringBuilder sb = new StringBuilder();
		System.out.println("処理開始");
		for(int i  = 0; i < 20000000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		System.out.println("処理終了");
		
		//かかった時間の表示を行う
		long end =  System.currentTimeMillis();
		System.out.println("処理にかかった時間は…" + (end - start) + "ミリ秒でした。");
	}
}

