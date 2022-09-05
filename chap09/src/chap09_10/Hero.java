package chap09_10;

public class Hero {
	String name;
	int hp;
	
	public void attack() {
		
	}
	
	public Hero(String name) {
		this.hp = 100;		//hpフィールドを100で初期化する
		this.name = name;	//引数の値でnameフィールドを初期化する。
	}
}
