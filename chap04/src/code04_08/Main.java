package code04_08;

public class Main {

	public static void main(String[] args) {
		int [] scores = {20, 30, 40, 50, 80};
		
		/* 教科書例題のもとのコード
		int sum = scores[1] + scores[2] + scores[3] + scores[4] + scores[5];
		*/
		
		//以下は、添え字（index）の修正を加えたコード
		int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
		int avg = sum / scores.length;
		
		System.out.println("合計点" + sum);
		System.out.println("平均点" + avg);

	}

}
