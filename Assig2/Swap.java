//4.	Write a Java program to swap two variables:
//o	a) Using a third variable
//o	b) Without using a third variable

public class Swap{
	public static void main(String[] args){
		int x = 10;
		int y = 20;
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x:" +x);
		System.out.println("y:" +y);
		
		int p = 15;
		int q = 5;
		
		p = p + q;
		q = p - q;
		p = p - q;
		
		System.out.println("p:"+p);
		System.out.println("q:"+q);
		
		
		
	}
}