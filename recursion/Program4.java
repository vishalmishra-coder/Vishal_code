package recursion;

public class Program4 {

   public static void main(String[] args) {
		System.out.println("Main Starts");
		test(1);
		System.out.println("Main Ends");
		
	}
	
	public static void test(int n) {
		if(n<3) {
			System.out.println("n from if is : " + n);
			test(n+1);
		}
		System.out.println("n from else is : " + n);
		
	}
	
	

}
