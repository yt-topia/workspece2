package code12_06;

public class Thief extends Character {
	
	public void sit (int sec) {
	this.hp += sec;
	System.out.println(this.name + "は、" + sec + "秒座った。");
	System.out.println("HPが" + sec + "ポイント回復した。");
	}
}
