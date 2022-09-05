package renshu15_03;

public class Name {
	public boolean hName1(String name) {
		return name.matches(".*");
	}
	
	public boolean hName2(String name) {
		return name.matches("A\\d{1,2}");
	}
	
	public boolean hName3(String name) {
		return name.matches("U[A-Z]{3}");
	}
}
