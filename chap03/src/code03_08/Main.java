package code03_08;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.print("現在" + (i + 1) + "周目→");
		}
			
			
	//ここから下は複雑なfor文
		//ループ変数を１からスタートする
		for (int i = 1; i < 10; i++) {
			System.out.println("テスト１");
			}
		
		//ループ変数を２ずつ増やす
		for (int i = 0; i < 10; i += 2) {
			System.out.println("テスト２");
			}
		
		//スープ変数を１０から１ずつ１まで、減らしていく
		for (int i = 10; i > 0; i--) {
			System.out.println("テスト３");
			}
		
		/*繰り返し時の処理を行わない
		for (int i = 0; i < 10;) {
			System.out.println("テスト４");
			}
			*/
		
		//ループ変数を初期化しない
		int i = 8;
		for (; i < 10; i++) {
			System.out.println("テスト５");
			}
	}

}
