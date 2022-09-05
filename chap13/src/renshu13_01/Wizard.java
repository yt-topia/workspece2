package renshu13_01;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public void heal(Hero h) {
		int basePoint = 10;	//基本回復ポイント
		int recovPoint = (int)(basePoint * this.wand.power);//杖による増幅
		h.selfHp(h.getHp() + recovPoint);	//勇者のHPを回復する
		
		System.out.println
		(h.getName() + "のHPを" + recovPoint + "回復した！");
	}
	
	//以下は、getteerの指定
	public int getHp() {return this.hp;}
	public int getMp() {return this.mp;}
	public String getName() {return this.name;}
	public Wand getWand() {return this.wand;}
	
	//以下は、setteerの指定
	//HPの妥当性検証をする
	public void setHp(int hp) {
		if (hp < 0) {this.hp = 0;}
		else {this.hp = hp;}
	}
	
	//MPの妥当性検証をする
	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException
			("杖に設定されようとしているMPが以上です");
		}
		this.mp = mp;
	}
	
	//nameの妥当性検証をする
	public void setName(String name) {
		if (name == null || name.length() < 3){
			throw new IllegalArgumentException
			("杖に設定されようとしている名前が以上です");
		}
		this.name = name;
	}
	
	//wandの妥当性検証をする
	public void setWand(Wand wand) {
		if (name == null){
			throw new IllegalArgumentException
			("設定されようとしている杖がnullになっています");
		}
		this.wand = wand;
	}
}