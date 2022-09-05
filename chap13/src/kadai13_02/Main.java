package kadai13_02;

public class Main {

	public static void main(String[] args) {
		FurikomiYoushi moushikomi = new FurikomiYoushi("5656", "8989", 3300);
		System.out.println(moushikomi.getFurikomimotoNumber());
		System.out.println(moushikomi.getFurikomisakiNumber());
		System.out.println(moushikomi.getFurikomigaku());
		
		Kouza moto = new Kouza(moushikomi.getFurikomimotoNumber());
		Kouza saki = new Kouza(moushikomi.getFurikomisakiNumber());
		System.out.println(moto.getYokingaku());
		System.out.println(saki.getYokingaku());
		
		Uketsuke shori = new Uketsuke();
		boolean result = shori.furikomi(moushikomi, moto, saki);
		
		Insatsu insatsu = new Insatsu();
		insatsu.print(result, moushikomi, moto, saki);
	}
}
