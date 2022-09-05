package code15_03;

public class Main {

	public static void main(String[] args) {
		String s1 = " Java programing  ";
		
		//指定した位置の文字や文字列を取り出す
		System.out.println(s1.charAt(3));
		System.out.println("文字列s1の4文字目以降は、" + s1.substring(3));
		System.out.println("文字列s1の4～8文字目は、" + s1.substring(3, 8));
		
		//すべて小文字に変換
		String s2 = s1.toLowerCase();
		if(s2.contains("java")) {
			System.out.println(s2);
		}
		
		//すべて大文字に変換
		String s3 = s1.toUpperCase();
			System.out.println(s3);
		
		//前後の空白を除去（※ただし、全角スペースは除去できない）
		String s4 = s1.trim();
		System.out.print(s4);
		System.out.println(s4);
		
		//文字列を置き換える
		String ss = "東京都新宿区都庁前";
		String s5 = ss.replace("東京都", "青森県");
		System.out.println(s5);
	}

}
