package code13_01;

public class Inn {
	public void checkIn(Hero h) {
		//以下のエラーは、Heroクラスの「int hp」をprivate指定しているのでアクセスできない。
		h.hp = -100;	
		System.out.println(h.hp);
	}
}