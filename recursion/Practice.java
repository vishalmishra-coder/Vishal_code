package recursion;
import java.util.Scanner;
public class Practice {
	static int big =0;
	static int small=9;
	public static void test(int n) {
		while(n>0) {
			int rem = n % 10;
			if(rem>big) {
				big=rem;
			}
			if(rem<small) {
				small =rem;
			}
			n = n/10;
			test(n);
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		test(n);
		System.out.println("Biggest Number : " + big);
		System.out.println("Smallest Number : " + small);
		int diff = big - small;
		System.out.println("Difference is : " + diff);
	}

}
