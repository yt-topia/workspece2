package code15_07;

public class Main {

	public static void main(String[] args) {
		String s = "aa\\2345";
		String[] words = s.split("[\\\\/$#&]");
		for(String w : words) {
			System.out.println(w + "->");
		}
	}
}
