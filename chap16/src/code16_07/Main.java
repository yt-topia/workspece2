package code16_07;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		//HashMapで表示させる
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 182);
		
		for(String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + "の人口kは、" + value);
		}
		System.out.print("\n");
		
		//TreeMapで表示させる
		Map<String, Integer> prefs2 = new TreeMap<String, Integer>();
		prefs2.put("長野県", 255);
		prefs2.put("新潟県", 1261);
		prefs2.put("北海道", 182);
		
		for(String key2 : prefs2.keySet()) {
			int value2 = prefs2.get(key2);
			System.out.println(key2 + "の人口kは、" + value2);
		}
		System.out.print("\n");
		
		//LinkedHashMapで表示させる
		Map<String, Integer> prefs3 = new LinkedHashMap<String, Integer>();
		prefs3.put("沖縄県", 255);
		prefs3.put("岡山県", 1261);
		prefs3.put("奈良県", 182);
		
		for(String key3 : prefs3.keySet()) {
			int value3 = prefs3.get(key3);
			System.out.println(key3 + "の人口は、" + value3);
		}
	}

}