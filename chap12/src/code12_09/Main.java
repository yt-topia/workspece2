package code12_09;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		
		/*
		//勇者による攻撃の処理
		Matango m = new Matango();
		Goblin g = new Goblin();
		Slime s = new Slime();
		
		Monster mo1 = m;
		Monster mo2 = g;
		Monster mo3 = s;
		
		h.attack(m);
		h.attack(g);
		h.attack(s);
		*/
		
		
		//モンスターたちの逃げ出しの処理
		Monster[] monsters = new Monster[3];
		monsters[0] = new Matango();
		monsters[1] = new Goblin();
		monsters[2] = new Slime();
		
		for (Monster m : monsters) {
			m.run();
		}
	}
}
