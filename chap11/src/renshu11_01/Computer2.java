package renshu11_01;

public class Computer2 extends TangibleAsset {
	String makerName;
	public Computer2(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}
	public String getMakerName() {return this.makerName;}
}