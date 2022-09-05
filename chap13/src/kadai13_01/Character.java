package kadai13_01;

public abstract class Character {
	String name;
	int hp;
	int mp;
	
	public abstract void attack();	//インターフェース,抽象メソッドはブロックで処理内容を記載しないでセミコロンで閉じる。
}
