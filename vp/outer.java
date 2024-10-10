package vp;

public class outer {
	static int x =49;
	int z;
	public static void test()
	{
		System.out.println("Method of outer class");
	}
	
	
	
	
	{
		z =89;
		System.out.println(z);
		System.out.println("This is a non static block -1");
	}
	
	static class Inner
	{
		static int y =45;
		public static void demo()
		{
			
			System.out.println("Method of inner class");
		}
	}
	
	{
		System.out.println("This is a non static block -2");
	}
	
	

}
