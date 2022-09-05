package kadai13_02;

public class FurikomiYoushi {
	private String furikomimotoNumber;
	private String furikomisakiNumber;
	private int furikomigaku;
	
	public FurikomiYoushi(String furikomimotoNumber, String furikomisakiNumber, int furikomigaku) {
		this.furikomimotoNumber = furikomimotoNumber;
		this.furikomisakiNumber = furikomisakiNumber;
		this.furikomigaku = furikomigaku;
	}
	
	
	public String getFurikomimotoNumber() {
		return this.furikomimotoNumber;
	}
	
	public String getFurikomisakiNumber() {
		return this.furikomisakiNumber;
	}
	
	public int getFurikomigaku() {
		return this.furikomigaku;
	}
}
