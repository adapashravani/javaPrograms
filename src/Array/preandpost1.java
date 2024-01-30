package Array;

public class preandpost1 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		a++;
		a--;
		b++;
		b--;
		++a;
		--b;
		
		int c=a++ + ++b + --b + --a + a++ + --a + a+b + a++ + b--;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
