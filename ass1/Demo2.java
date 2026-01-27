//8.	Write a program to display default values of data types.

public class Demo2{
	//default value	
		int x ;
		short y;
		byte b;
		long l;
		char c ;
		float f ;
		double d;
		boolean bool;
		
	public static void main(String[] args){
		Demo2 demo = new Demo2();
		
		System.out.println(demo.x);
		System.out.println(demo.y);
		System.out.println(demo.b);
		System.out.println(demo.l);
		System.out.println(demo.c);
		System.out.println(demo.f);
		System.out.println(demo.d);
		System.out.println(demo.bool);
	}
}