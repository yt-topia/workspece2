package renshu17_02;

public class Main {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());

		}catch (NullPointerException e){
			System.out.println("NullPointerException例外をcatchしました。");
			System.out.println("-- スタックトレース（ここから）--");
			e.printStackTrace();

			//getMessage()の表示
//			e.getMessage();		//←この記述方法では不可
			System.err.println(e.getMessage());

			System.out.println("-- スタックトレース（ここまで）--");
		}
	}
}