package renshu05_04;

public class Main {

	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10.5, 20.5);
		System.out.println("三角形の面積は" + triangleArea + "平方cmです。");
		
		double circleArea = calcCircleArea(5.5);
		System.out.println("円の面積は" + circleArea + "平方cmです。");
		
		System.out.println("\n");	//改行入れる
		
		for (String test : args) {
			System.out.println(test);
		}
	}
	
	
	
	public static double calcTriangleArea(double bottom, double height) {
		double area = (bottom * height) / 2;
		return area;
	}
	
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
}
