package code03_05;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("あなたの運勢を占います");
		
		//switch文のテストコード
				int fortune2 = new java.util.Random().nextInt(4) + 1;
				switch (fortune2) {
					case 1:
						System.out.println("大吉");
						break;
					
					case 2:
						System.out.println("中吉");
						break;
					
					case 3:
						System.out.println("吉");
						break;
						
					default:
						System.out.println("凶");
				} 
	}
}
