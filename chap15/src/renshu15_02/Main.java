package renshu15_02;

public class Main {

	public static void main(String[] args) {
		ccpath ccp = new ccpath();
		String text = ccp.concatPath("c:\\javadev", "readme.txt");
		System.out.println(text);
	}

}
