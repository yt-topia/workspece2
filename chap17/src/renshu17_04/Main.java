package renshu17_04;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Program pp = new Program();
		pp.pro();
		
		throw new IOException("mainでお手上げです。");
	}

}
