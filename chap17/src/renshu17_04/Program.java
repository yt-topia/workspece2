package renshu17_04;

import java.io.IOException;

public class Program {
	public void pro() throws IOException {
	System.out.println("プログラムが起動しました。");
	throw new IOException("Programクラスでお手上げです。");
	}
}
