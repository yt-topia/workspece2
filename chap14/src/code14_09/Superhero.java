package code14_09;

public class Superhero extends Hero {
//	String name = "ishida";
//	String ss;
//	int ii;

	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}

		if(o instanceof Hero) {
			Hero h = (Hero)o;
			if(this.equals(h)) {
				return true;
			}
		}
*/
		return false;
	}
}
