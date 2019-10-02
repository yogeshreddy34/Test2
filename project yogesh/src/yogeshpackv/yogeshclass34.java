package yogeshpackv;

public class yogeshclass34 extends yogeshclass32 {
	
	public void m1() {
		System.out.println(x + y);
	}

	public static void m2() {
		yogeshclass32 obj = new yogeshclass32();
		System.out.println(obj.x * y);
	}

	public static void main(String[] args) {
		yogeshclass34 obj = new yogeshclass34();
		obj.m1();
		m2();
	}

}
