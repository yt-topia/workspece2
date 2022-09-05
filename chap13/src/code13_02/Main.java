package code13_02;

import code13_01.Hero;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		
		//以下は、アクセス制御をしているためエラーになっている。
		h.bye();
		h.sleep();
	}
}
