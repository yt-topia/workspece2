package code11_02;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		
		Matango m = new Matango();
		h.attack(m);
		
		/*
		Character c = new Character();
		c.name = "ミナト";
		c.attack(m);
		*/
		
		Dancer d = new Dancer();
		d.name = "アカネ";
		d.dance();
		d.attack(m);
		System.out.println(m.hp);
	}

}