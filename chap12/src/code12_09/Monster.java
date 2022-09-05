package code12_09;

public class Monster extends Character {
	String name;
	int hp;
	
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}
