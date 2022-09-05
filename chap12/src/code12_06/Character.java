package code12_06;

public abstract class Character {
	String name;
	int hp;
	
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}