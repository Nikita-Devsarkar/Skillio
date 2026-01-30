//1.	Write a Java program to declare and initialize variables of all primitive data types and print their values.

public class Primitive{
	int x = 20;
	short z = 10;
	byte b = 5;
	long l = 444;
	static float y = 12.2f;
	double d = 99.99;
	boolean e = true;
	
	public static void main(String[] args){
		char c = 'H';
		Primitive data = new Primitive();
		
		System.out.println("int:"+data.x);
		System.out.println("short:"+data.z);
		System.out.println("byte:"+data.b);
		System.out.println("long:"+data.l);
		System.out.println("float:"+y);
		System.out.println("double:"+data.d);
		System.out.println("char:"+c);
		System.out.println("boolean:"+data.e);
		
	}
}