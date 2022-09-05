package code16_08;

import java.util.ArrayList;
import java.util.List;

//Heroクラスにnameフィールド作成
class Hero{
	public String name;
}


public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		List<Hero> list = new ArrayList<Hero>();
		list.add(h);
		System.out.println(list.get(0).name);
		
		h.name = "スガワラ";
		System.out.println(list.get(0).name);
		
		list.add(h);
		h.name = "アサカ";
		System.out.println(list.get(0).name);
	}

}