//10. Write a program to differentiate primitive and non-primitive data types.

public class Diff{
	int x = 10;
	byte y = 20;
	short z = 5;
	long l = 3333;
	char s = 'A';
	float f = 12.0f;
	double d = 30.33;
	boolean bo = true;
	
	public static void main(String[] args){
		
		Diff di = new Diff();
		
		System.out.println("int:"+ di.x);
		System.out.println("byte:" + di.y);
		System.out.println("short:" + di.z);
		System.out.println("long: " + di.l);
		System.out.println("char: " + di.s);
		System.out.println("float:" + di.f);
		System.out.println("double:" + di.d);
		System.out.println("boolean:" + di.bo);
		
		String str = "Nikita";
		System.out.println(str);
		
		
		
	}
}