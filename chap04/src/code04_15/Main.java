package code04_15;

public class Main {

	public static void main(String[] args) {
		int [] arrayA = {1, 2, 3};
		int [] arrayB;
		int [] arrayC = {5, 6, 7};
		
		arrayB = arrayA;
		arrayB[0] = 100;
		
		arrayB = arrayC;
		
		
		System.out.println(arrayA[0]);
		System.out.println(arrayB[0]);

	}

}
