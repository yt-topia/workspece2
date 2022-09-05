package code10_08;

import code10_01.Hero;

public class SuperHero extends Hero{
		//SuperHeroの追加分
		boolean flying;
		
		public void fly() {
			this.flying = true;
			System.out.println("飛び上がった");		//飛ぶ
		}
			
		public void land() {
			this.flying = false;
			System.out.println("着地した");			//着地する
		}
		
		public void run() {
			System.out.println(this.name + "は撤退した");
		}
}
