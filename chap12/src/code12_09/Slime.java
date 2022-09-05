package code12_09;

public class Slime extends Monster {
	public Slime() {
		this.name = "スライム";
	}
	
	public void run() {
		System.out.println(this.name + "は溶けて逃げ出した！");
	}
}