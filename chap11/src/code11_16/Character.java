package code11_16;

public class Character {
	String name;
	int hp;
	
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	//戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 2;
		System.out.println("敵に？？ポイントのダメージを与えた！");
	}
}
