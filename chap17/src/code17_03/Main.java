package code17_03;

import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello");
			fw.close();
			
			int[] array = new int[3];
			array[4] = 10;
			
		}catch(Exception e) {
			System.out.println("何らかのエラーが発生しました。");
		}
	}

}
