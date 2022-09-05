package renshu11_01;

public abstract class TangibleAsset {
	String name;
	int price;
	String color;
	
	public TangibleAsset(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
	public String getName() {return this.name;}
	public int getPrice() {return this.price;}
	public String getColor() {return this.color;}
}

/*
//練習問題11-02
public abstract class TangibleAsset extends Asset {
	String color;
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}
	public String getColor() {return this.color;}
}
*/


/*
//練習問題11-04
public abstract class TangibleAsset extends Asset implements Thing {
	String color;
	double weight;
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}
	public String getColor() {return this.color;}
	public double getWeight() {return this.weight;}
	public void setWeight(double weight) {this.weight = weight;}	
}
*/