package shravani;

public class Methodwithparameter {
static int id=111;
static int pwd=2435;
static  void login (int X,int Y)
{
	if (id==X&&pwd==Y)
	{
		display();
	}
	else
	{
		System.out.print("check the un&pwd");
}
	
}
static void display()
{
	System.out.print("userid is"+id);
	System.out.print("user password is"+pwd);
	
}
	public static void main(String[] args) {
	login(111,2435);	

	}

}
