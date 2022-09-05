package renshu03_03;

public class Main {

	public static void main(String[] args) {
		int isHungry = 0;
		String food = "apple";
		
		System.out.println("こんにちは");
		
		if (isHungry == 0) {
			System.out.println("おなかがいっぱいです");
		}else {
			System.out.println("はらぺこです");
		}
		
		if (isHungry != 0) {
			System.out.println(food + "をいただきます");
			System.out.println("ごちそうさまでした");
		}else {
			
		}
		
	}

}
