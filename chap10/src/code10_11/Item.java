package code10_11;

public class Item {
	String name;
	int price;
	
	public Item(String name) {
		this.name = name;
		this.price = 0;
	}
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//引数指定なしのコンストラクターを設定する
	public Item() {
		this.name = "引数指定なしのコンストラクター";
		this.price = 0;
	}
}
