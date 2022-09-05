package code17_11;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(28);		//誤った値のセットを試みる→例外発生
		System.out.println(p.getAge());
	}
}