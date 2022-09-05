package kadai13_02;

public class Kouza {
	private String kouzaNumber;
	private int yokingaku;
	
	public Kouza(String kouzaNumber) {
		this.kouzaNumber = kouzaNumber;
		
		if(kouzaNumber == "5656") {
			this.yokingaku = 50;
		}else if(kouzaNumber == "8989") {
			this.yokingaku = 30000;
		}else {
			throw new IllegalArgumentException("口座情報が見当たりません");
		}
	}
	
	
	public String getKouzaNumber() {
		return this.kouzaNumber;
	}
	
	public void setKouzaNumber(String kouzaNumber) {
		this.kouzaNumber = kouzaNumber;
	}
	
	public int getYokingaku() {
		return this.yokingaku;
	}
	
	public void setYokingaku(int yokingaku) {
		this.yokingaku = yokingaku;
	}
}
