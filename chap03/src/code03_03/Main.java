package code03_03;

public class Main {

	public static void main(String[] args) {
		boolean tenki = false;
		String initial = "雅び";
		if (initial.equals("雅")) {
			System.out.println("洗濯をします");
			System.out.println("散歩に行きます");
		}
		else
			System.out.println("DVDを見ます");
		
		
		//ここから、論理演算子のテスト用コード
		int age = 18;
		int month = 5;
		String name = "斎藤";
		
		if(age <= 18 && month == 5) {
			System.out.println("合格です！");
		}
		if(name.equals("斉藤") || name.equals("斎藤")) {
			System.out.println("ようこそ、サイトウ様");
		}
		
		
		//ここから、&& ||のテスト用コード
		int hp = 200;
		boolean poison = true;
		
		if(((!(hp < 100) && !(poison == false))) || (hp >= 300 && poison == false)) {
			System.out.println("テストです");
		}
	}

}
