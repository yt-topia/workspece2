package code15_09;

public class Money {
	final String FORMAT = "%-4s%-5s所持金%6d";
	Hero hero = new Hero();
	String s = String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
}
