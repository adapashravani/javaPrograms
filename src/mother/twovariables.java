package mother;

public class twovariables {

	public static void main(String[] args) {
       int a=10;
       int b=20;
       int c;
       System.out.println("before swap a_ _ _:"+a);
       System.out.println("before swap a_ _ _:"+b);
       System.out.println("_ _ _ _");
       c=a;              //c_ _ _>10
       a=b;              //a_ _ _>20
       b=c;              //b_ _ _>10
       System.out.println("after swap a_ _ _:"+a);
       System.out.println("after swap a_ _ _:"+b);
	}

}
