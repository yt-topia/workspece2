package code12_02;

public class Main {

	public static void main(String[] args) {
		Wizard w = new Wizard();
		Matango m = new Matango();
		w.name = "アサカ";
		w.attack(m);
		w.fireball(m);
		w.run();
		
		Character c = w;
		//Matango m = new Matango();	//上記で生成済みなのでコメントアウト
		c.name = "ミナト";
		c.attack(m);
		//c.fireball(m);
		//上記はCharacter型にしているため、箱の中身がWizardでもCharacterには、fireballは存在していないのでエラーになる。
		c.run();
	}
}
