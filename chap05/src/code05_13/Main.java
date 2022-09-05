package code05_13;

public class Main {
	//int配列を受け取り
	//配列内の要素すべてに１を加えるメソッド
	public static void incArray(int[] array) {		
		for  (int i = 0; i < array.length; i++) {
			array[i]++;
		}
		
		//以下、拡張for文は値を取り出すだけなので、値を書き換えるには従来for文でなければいけない。
		/*
		for (int i : array) {
			i++;
		}
		*/
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		incArray(array);
		for (int i : array) {
			System.out.println(i);
		}

	}

}
