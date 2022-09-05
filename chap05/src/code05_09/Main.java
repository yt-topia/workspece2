package code05_09;

public class Main {

	public static void main(String[] args) {
		sample();
		sample1();
	}
	
	public static int sample() {
		return 1;
		//int x = 10;
	}
	
	//return;より後に記述したものでも、if文のような条件指定があればそのまま実行される。
	public static void sample1() {
		int a = 2;
		if (a == 1) {
			return;
		}else {
			System.out.println("returnより後の処理内容");	
		}
	}

}

	