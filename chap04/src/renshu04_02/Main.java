package renshu04_02;

public class Main {

	public static void main(String[] args) {
		int[] moneyList = new int[] {121902, 8302, 55100};
		
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println("moneyListに入っている値は、" + moneyList[i]);
		}	
			
		for (int value : moneyList) {
			System.out.println("moneyListに入っている値は、" + value);
		}
	}

}
