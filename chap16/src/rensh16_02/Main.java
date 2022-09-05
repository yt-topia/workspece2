package rensh16_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		//練習問題16_02
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		Hero h3 = new Hero("高橋");
		
		List<Hero> heroName = new ArrayList<Hero>();
		heroName.add(h1);
		heroName.add(h2);
		heroName.add(h3);
		
		//以下、要素の中身を取り出して表示する処理
		//拡張for文バージョン
		for(Hero h : heroName) {
			System.out.println(h.getName());
		}
		
		System.out.print("\n");
		
		//通常for文バージョン
		for(int i = 0; i < heroName.size(); i++) {
			Hero hh = heroName.get(i); 
			System.out.println(hh.getName());
		}
		
		System.out.print("\n");
		
		//イテレータのバージョン
		Iterator<Hero> it = heroName.iterator();
		while(it.hasNext()) {
			Hero s = it.next();
			System.out.println(s.getName());
		}
		
		System.out.print("\n");
		
		
		//練習問題16_03
		Map<Hero, Integer> heros = new HashMap<Hero, Integer>();
		heros.put(heroName.get(0), 3);
		heros.put(heroName.get(1), 7);
		heros.put(heroName.get(2), 13);
		
		for(Hero key : heros.keySet()) {
			int score = heros.get(key);
			System.out.println(key.getName() + "が倒した適＝" + score);
		}
	}
}