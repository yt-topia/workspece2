package code10_01;

public class Hero {
	public String name = "ミナト";
	public int hp = 100;
	
	//戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた！");
	}
	
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}
