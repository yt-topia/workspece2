package renshu05_01;

public class Main {
	public static void main(String[] args) {
		introduceOneself();
	}

	public static void introduceOneself() {
		String name = "スガワラ";
		int age = 11;
		double height = 151.22;
		char zodiac = '寅';
		
		System.out.println("わたしの名前は" + name + "と言います。");
		System.out.println("年齢は" + age + "で、" + zodiac + "年生まれです。");
		System.out.println("身長は" + height + "cmあります。");
	}

}
