package renshu11_01;

public class Computer {
	String name;
	int price;
	String color;
	String makerName;
	
	//コンストラクタ
	public Computer(String name, int price, String color, String makerName) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.makerName = makerName;
	}
	
	//メソッド
	public String getName() {return this.name;}
	public int getPrice() {return this.price;}
	public String getColor() {return this.color;}
	public String getmakerName() {return this.makerName;}
}
