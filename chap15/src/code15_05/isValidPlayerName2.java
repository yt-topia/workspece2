package code15_05;

public class isValidPlayerName2 {
	public boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7,9}");
	}
}
