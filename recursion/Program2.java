package recursion;

public class Program2 {
	static int x =0;
	public static void test() {
		x++;
		if(x<3) {
			System.out.println("X from if is : " + x);
			test();
		}
		
		
		System.out.println("x from method is : " + x);
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		test();
		System.out.println("Main Ends");
	}

}
