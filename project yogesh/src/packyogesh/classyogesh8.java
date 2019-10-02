package packyogesh;
//method chaining concept where m1 is static and m2 is non static
public class classyogesh8 {
	public static void y1() {
		System.out.println("s1");
	}
	public void y2 () {
		y1();
		System.out.println("ns2");
	}
	public static void main(String[] args) {
		classyogesh8 obj = new classyogesh8();
				obj.y2();
	}

}
