package code14_15;

public class Hero {
	String name;
	int hp;
	static int money;
	
	//this.nameのthisは、自分のインスタンスを指す指定なので、staticを指定したメソッド内でインスタンスを生成してないのに呼び出しをしているのでエラー。
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
		System.out.println(this.name + "たちの所持金を初期化しました。");
	}
}
