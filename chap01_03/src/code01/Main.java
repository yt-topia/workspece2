package code01;

public class Main {
	public static void main (String[] args) {
		double pi = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "㎝のパイの面積は");
		System.out.println(pie * pie * pi);
		System.out.println("パイの半径を倍にします");
		pi = 10;
		System.out.println("半径" + pie + "㎝のパイの面積は");
		System.out.println(pie * pie * pi);
		
		/*
		final double PI = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		System.out.println("パイの半径を倍にします");
		PI = 10;
		System.out.println("半径" + pie + "㎝のパイの面積は");
		System.out.println(pie * pie * PI);
		*/
	}
}
