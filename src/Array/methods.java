package Array;

public class methods {

	public static void add() {
	System.out.println("add method starts");
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
	sub();
	System.out.println("add method ends");
	}
    public static void sub()
    {
    System.out.println("sub method starts");
    int x=100;
    int y=50;
    int z=x-y;
    System.out.println(z);
    System.out.println("sub method ends");
    }
    public static void main(String[] args) {
    	System.out.println("main method starts");
    	add();
    	System.out.println("main method end");
    }
}
