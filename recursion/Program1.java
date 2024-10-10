package recursion;

public class Program1 
{
	static int x=0;
	
	public static void test() {
		x++;
		if(x<3) 
		{
			System.out.println("X from if is : " + x);
			test();
		}
		else 
		{
			System.out.println("X from else is : " + x);
		}
	
		
	}

	public static void main(String[] args)
	{
		System.out.println("Mains Starts");
		test();
		System.out.println("Mains Ends");
		}
}
