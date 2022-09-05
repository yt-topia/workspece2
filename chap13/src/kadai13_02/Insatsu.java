package kadai13_02;

public class Insatsu {
	
	public void print(boolean result, FurikomiYoushi moushikomi, Kouza moto, Kouza saki) {
		if(result == true) {
			System.out.println("振込が完了しました");
			System.out.println("振込元口座：" + moushikomi.getFurikomimotoNumber());
			System.out.println("振込先口座：" + moushikomi.getFurikomisakiNumber());
			System.out.println("振込金額：" + moushikomi.getFurikomigaku());
			System.out.println("振込元の残高：" + moto.getYokingaku() + "、振込先の残高：" + saki.getYokingaku());
		}else {
			System.out.println("残高不足で振込が失敗しました");
			System.out.println("振込元口座：" + moushikomi.getFurikomimotoNumber());
			System.out.println("振込先口座：" + moushikomi.getFurikomisakiNumber());
			System.out.println("振込金額：" + moushikomi.getFurikomigaku());
			System.out.println("振込元の残高：" + moto.getYokingaku() + "、振込先の残高：" + saki.getYokingaku());
		}
	}
}
