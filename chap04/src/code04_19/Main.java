package code04_19;

public class Main {

	public static void main(String[] args) {
		int[][] scores = {{40, 50, 60}, {80, 70, 90, 100}};
		
		System.out.println(scores[1][3]);
		
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		
		scores[0] = new int[] {100, 120, 180, 250};
		System.out.println(scores[0].length);
		System.out.println(scores[0][2]);

	}

}
