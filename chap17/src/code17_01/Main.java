package code17_01;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello");
			fw.close();

			int[] array = new int[3];
			array[13] = 10;

		}catch (IOException | ArrayIndexOutOfBoundsException e) {
			System.out.println("エラーが発生しました：" + e.getMessage());
		}
	}
}