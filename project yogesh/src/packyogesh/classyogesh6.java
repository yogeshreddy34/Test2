package packyogesh;
//method chaining concept where m1 and m2 are static

public class classyogesh6 {
	public static void y1() {
		System.out.println("s1");
	}
	public static void y2() {
		y1();
		System.out.println("s2");
	}
	public static void main(String[] args) {
		y2();
	}

}
