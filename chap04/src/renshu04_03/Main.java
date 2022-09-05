package renshu04_03;

public class Main {

	public static void main(String[] args) {
		int[] counts = null;
		float[] heights = {171.3F, 175.0F};
		
		System.out.println(counts[1]);
		//参照先の指定なしのエラー
		
		System.out.println(heights[2]);
		//要素の数が2つしか存在しないのに、3つ目の要素を指定しているため起きているエラー
	}

}
