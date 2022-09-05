package code11_02;

public class Hero extends Character {
	int mp;
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージを与えた！");
		m.hp -= 10;
	}

}
