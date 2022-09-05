package chap09_05;

public class Wizard {
	String name;
	int hp;
	
	public void heal(Hero h){
		h.hp += 10;
		System.out.println(h.name + "のhpを10回復した！" + "（現在値は、"+ h.hp + "）");
	}
}