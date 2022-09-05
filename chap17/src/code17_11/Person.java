package code17_11;

public class Person {
	int age;
	public void setAge(int age) {
		if(age < 0) {		//ここで引数をチェックする
			throw new IllegalArgumentException
			("年齢は0以上の数値を指定すべきです。指定値＝" + age);
		}
		
		this.age = age;		//問題ないなら、フィールドに値をセット
	}
	
	public int getAge() {	//問題なく値がセットされたらgetterで返す
		return this.age;
	}
}