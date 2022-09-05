package code08_02;

public class Main {

	public static void main(String[] args) {
		//１．勇者を生成
		Hero h = new Hero();
		
		//２．フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		/*
		System.out.println("勇者" + h.name + "を生み出しました！");
		*/
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		//３．勇者のメソッドを呼び出してゆく
		/*h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		*/
		
		//冒険のはじまり
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}

}
