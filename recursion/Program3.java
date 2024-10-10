package recursion;

public class Program3 {
	
	public static void test(int n) {
		if(n<3) {
			System.out.println("n from if is : " + n);
			test(n + 1);
		}
		else {
			System.out.println("n from else is : " + n);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Main Starts");
		test(1);
		System.out.println("Main Ends");
	}

}



