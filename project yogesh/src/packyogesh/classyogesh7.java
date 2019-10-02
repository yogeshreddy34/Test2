package packyogesh;
// mathod chaining concept m1 is non static and m2 is static
public class classyogesh7 {
	public void y1() {
		System.out.println("ns1");
	
	}
	public static void y2() {
		classyogesh7 obj = new classyogesh7();
				obj.y1();
		System.out.println("s2");
	}
	public static void main(String[] args) {
		y2();
	}

}
