package code12_09;

public class Goblin extends Monster {
	public Goblin() {
		this.name = "ゴブリン";
	}
	
	public void run() {
		System.out.println(this.name + "は馬に乗って逃げ出した！");
	}
}
