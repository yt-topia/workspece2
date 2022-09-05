package kadai13_02;

public class Uketsuke {
	public boolean furikomi(FurikomiYoushi moushikomi, Kouza moto, Kouza saki){
		if(moto.getYokingaku() >= moushikomi.getFurikomigaku()) {
			moto.setYokingaku(moto.getYokingaku() - moushikomi.getFurikomigaku());
			saki.setYokingaku(saki.getYokingaku() + moushikomi.getFurikomigaku());
			return true;
		}
		else {
			return false;
		}
	}
}
