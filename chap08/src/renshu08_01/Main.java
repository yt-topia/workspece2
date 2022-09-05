package renshu08_01;

public class Main {

	public static void main(String[] args) {
		Cleric c = new Cleric();
		
		//フィールドの値を指定
		c.hp -= 5;
		c.name = "ミナト";
		
		//メソッドで操作を行う
		c.selfAid();
		c.pray(2);
		c.pray(25);
	}

}
