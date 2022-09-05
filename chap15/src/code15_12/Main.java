package code15_12;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		//6つのint値からDateインスタンスを生成
		c.set(2019, 8,22,1,23,45);
		
		//上記の日時の「月」の箇所だけ上書き
		c.set(Calendar.MONTH, 9);
		
		//同様に、上記の日時のすべての箇所を以下の日時でさらに上書き
		c.set(2022, 10, 11, 2, 22,33);
		
		Date d = c.getTime();
		System.out.println(d);
		
		
		//Dateインスタンスからint値を生成
		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です。");
	}

}
