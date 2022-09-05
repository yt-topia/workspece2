package chap09_12;

public class Hero {
	String name;
	int hp;
	
	
	public Hero(String name) {
		this.hp = 100;		//hpフィールドを100で初期化する
		this.name = name;	//引数の値でnameフィールドを初期化する
	}
		public Hero() {
			this.hp = 100;		
			this.name = "ダミー";
		}
}