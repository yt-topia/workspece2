package code14_06;

public class Hero {
	String name;
	int hp;
	
	//フィールドの値を表示させる処理
	/*
	public String toString() {
		return "名前：" + this.name + "／HP：" + this.hp;
	}
	*/
	
	public boolean equals(Object o) {
		if(this == o) {return false;}
		if(o instanceof Hero) {
			Hero h = (Hero)o;
			if(this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
}