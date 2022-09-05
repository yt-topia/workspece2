package code14_13;

public class Main {

	public static void main(String[] args) {
		Hero.setRandomMoney();
		
		//インスタンスを生成する前でも呼び出すことができる
		System.out.println(Hero.money);
		
		//インスタンスを生成後も、同じように呼び出しはできる
		Hero h1 = new Hero();
		System.out.println(h1.money);
		
	}

}
