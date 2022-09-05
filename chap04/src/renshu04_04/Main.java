package renshu04_04;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {3, 4, 9};
		
		System.out.println("一桁の数字を入力してください。");
		
		int input = new java.util.Scanner(System.in).nextInt();
		
		for (int i = 0; i < numbers.length; i++) {
			int Number = numbers[i];
			if (Number == input) {
				System.out.println("あたり");
			}else {
				System.out.println("はずれ");
			}
		}

	}

}
