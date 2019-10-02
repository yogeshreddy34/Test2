package packyogesh2;
//creating minimum and maximum values

public class classyogesh11 {
	byte bMin = Byte.MIN_VALUE;
	byte bMax = Byte.MAX_VALUE;
	
	short sMin = Short.MIN_VALUE;
	short sMax = Short.MAX_VALUE;
	
	int iMin = Integer.MIN_VALUE;
	int iMax = Integer.MAX_VALUE;
	
	long lMin = Long.MIN_VALUE;
	long lMax = Long.MAX_VALUE;
	
	public void dataranges() {
		System.out.println("Byte min value is :"+bMin);
		System.out.println("Byte max value is :"+bMax);
		System.out.println("Short min value is :"+sMin);
		System.out.println("Short max value is :"+sMax);
		System.out.println("int min value is :"+iMin);
		System.out.println("int max value is :"+iMax);
		System.out.println("long min value is :"+lMin);
		System.out.println("long max value is :"+lMax);
	}
	public static void main(String[] args) {
	 classyogesh11 obj = new classyogesh11();
	 obj.dataranges();
	}

}
