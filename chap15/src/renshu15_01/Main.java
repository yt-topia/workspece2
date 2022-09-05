package renshu15_01;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 100; i++) {	//←for(int i = 1; i < 101; i++)でも良い。
			sb.append(i + 1).append(",");
		}
		
		String s = sb.toString();
		System.out.println(s);
		
		String[] a = s.split(",");
		for(String p : a) {
			System.out.println(p);
		}
	}

}
