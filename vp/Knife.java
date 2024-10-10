package vp;

public class Knife {
	 int x = 49;
	public void test()
	{
		System.out.println("This is test method");
		int x =60;
		System.out.println("Local of x is :" + x);
		x = 70;
		System.out.println("Local of x is :" + x);
		System.out.println("Global of x is :" + this.x);
		this.x = 50;
		System.out.println("Global of x is :" + this.x);
		
	}
	public static void main(String[] args)
	{
		Knife k1 = new Knife();
		
		int x=90;
		System.out.println("Local of x is :" + x);
		System.out.println(k1.x);
		k1.test();
	}
}
