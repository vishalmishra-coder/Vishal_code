package constructor;

public class StaticKeyword {
	/*Static Keyword = Static keyword is a keyword which is used for memory management purpose . if a member is a declared
	by using keyword static then such members are loaded in class static area*/
	
	/*Static Block = If a block in java is declared by using static keyword then such blocks is called static block
	a static block is loaded in class static area and will get executed at the same time before main method*/
	
	
	/*//Example 1 :
	static 
	{
		System.out.println("This is a static block -1 ");
		
	}
	public static void main(String [] args)
	{
		System.out.println("This is a main method");
	}
	static 
	{
		System.out.println("This is static block -2");
		int x =30;
		System.out.println("x is :" + x);
	}*/
	
	
	
	//Example 2 :
	static int x =34;
	static int y ;
	static 
	{
		System.out.println("Static block -1");
		System.out.println(x +" "+ y);
	    x =90;
		int y =50;
		System.out.println(x + " " + y);
		
	}
	public static void main (String[] args)
	{
		System.out.println("This is main method " + x + " " +y);
	}
	public static void test()
	{
		System.out.println("Test method " + x + " " +y);
		int y =68;
		System.out.println(x + " " + y);
		
	}
	
	static {
		System.out.println("Static block --2 ");
		test();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
