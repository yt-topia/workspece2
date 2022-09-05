package code16_05;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		//TreeSetでの処理
		Set<String> words = new TreeSet<String>();
		words.add("eagle");
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		
		for(String s : words) {
			System.out.print(s + "→");
		}
		
		System.out.print("\n");
		
		//LinkedHashSetでの処理
		Set<String> words2 = new LinkedHashSet<String>();
		words2.add("eagle2");
		words2.add("dog2");
		words2.add("cat2");
		words2.add("wolf2");
		words2.add("panda2");
		
		for(String s2 : words2) {
			System.out.print(s2 + "→");
		}
	}

}