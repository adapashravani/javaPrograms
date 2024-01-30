package Array;

public class preandpost {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		a++;
		b++;
		
		int c=a++ + ++a + b++ + ++a + ++b + a+b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
