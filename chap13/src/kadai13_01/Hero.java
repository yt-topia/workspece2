package kadai13_01;

public class Hero implements Character {
	Hero h = new Hero();
	h.name = "ミナト";
	h.hp = 1000;
	h.mp = 1000;
	
	public void attack() {
		System.out.println(this.name + "は攻撃を放った！");
		System.out.println("100ポイントのダメージを与えた！");
		h.hp -= 100;
	}
}
