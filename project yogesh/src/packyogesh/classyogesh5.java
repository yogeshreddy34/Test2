package packyogesh;

// method chaining concept where m1 and m2 are non static
class classyogesh5 {
	public void y1() {
		System.out.println("ns1");
	}
	public void y2() {
		y1();
		System.out.println("s2");
	}
	public static void main(String[] args) {
		classyogesh5 obj=new classyogesh5();
				obj.y2();
	}

}
