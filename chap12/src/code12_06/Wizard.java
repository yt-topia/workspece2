package code12_06;

public class Wizard extends Character {
	
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ。");
		System.out.println("5のダメージ！");
	}
}