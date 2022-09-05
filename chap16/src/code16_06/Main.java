package code16_06;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		
		//東京都の人口を表示する
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は、" + tokyo);
		
		//京都府を削除
		prefs.remove("京都府");
		
		//熊本県の人口を上書き変更して表示する
		prefs.put("熊本県", 323);
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は、" + kumamoto);
	}

}
