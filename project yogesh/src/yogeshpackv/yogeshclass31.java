package yogeshpackv;
// types of variales
// local variable, global variable and class or static variable
// local variable---> inside the method
// global variable---> inside the class and out side the method
// class or static ---> if have static keyword in global

public class yogeshclass31 {
	
	//global
	static int x = 11;
	
	// static or class
	static int y = 20;
	
	// non static method access--> static and non static membrs
	// static members access--> only static members // for non static have to call object

	public void y1() {
		int z=10;
		System.out.println(x+y+z);
	}
	public static void y2() {
		System.out.println(x+y);
	}
}
