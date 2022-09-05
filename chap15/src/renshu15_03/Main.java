package renshu15_03;

public class Main {

	public static void main(String[] args) {
		Name n = new Name();
		boolean b1 = n.hName1("test test");
		boolean b2 = n.hName2("A223");
		boolean b3 = n.hName3("UTAC");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
