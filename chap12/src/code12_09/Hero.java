package code12_09;

public class Hero extends Character {
	/*
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージ");
		m.hp -= 10;
	}
	
	public void attack(Goblin g) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージ");
		g.hp -= 10;
	}
	*/
	
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージ");
		m.hp -= 10;
	}
}