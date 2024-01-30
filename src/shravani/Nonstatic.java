package shravani;

public class Nonstatic {
	int a=100;
	public void login()
	{
		System.out.println("login success");
	}
	public static void main(String[] args) {
		new Nonstatic().login();
		System.out.println(new Nonstatic().a);
	}

}
