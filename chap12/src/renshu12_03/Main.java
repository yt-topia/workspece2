package renshu12_03;

public class Main {

	public static void main(String[] args) {
		X[] array = new X[2];
		array[0] = new A();
		array[1] = new B();
		
		for (X x : array) {
			x.c();
		}
	}
}
