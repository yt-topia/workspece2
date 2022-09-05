package renshu05_03;

public class Main {

	public static void main(String[] args) {
		String title = "町内会議のご案内";
		String address = "abcd@gmail.com";
		String text = "今年の町内祭りについて会議を行います。";
		email(address, text);
	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：" + "無題");
		System.out.println("本文：" + text);
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);

	}

}
