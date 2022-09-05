package renshu13_01;

public class Wand {
	private String name;	//杖の名前
	private double power;	//杖の魔力
	
	//以下は、getteerの指定
	public String getName() {return this.name;}
	public double getPower() {return this.power;}
	
	
	//以下は、setterの指定
	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException
			("杖に設定されようとしている名前が以上です");
		}
		this.name = name;
	}
	
	public void setPower(double power) {
		if (power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException
			("杖に設定されようとしている魔力が以上です");
		}
		this.power = power;
	}
}