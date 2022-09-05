package chap09_10;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero("ミナト");	//ここで引数を渡さなければエラーが出る。
		System.out.println(h.hp);
		System.out.println(h.name);
	}

}
