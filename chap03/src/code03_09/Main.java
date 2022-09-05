package code03_09;

public class Main {

	public static void main(String[] args) {
		
		//九九の表を出力する
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
