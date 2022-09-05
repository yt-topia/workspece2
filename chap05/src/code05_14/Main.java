package code05_14;

public class Main {
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		int[] array = makeArray(11);
		for (int i : array) {
			System.out.println(i);
		}

		//追加情報として設定したコマンドライン引数を取得して表示させる。
		for (String name : args) {
			System.out.println(name);
		}
	}

}
