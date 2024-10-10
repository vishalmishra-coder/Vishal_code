package recursion;
import java.util.Scanner;
public class Program6 {
	
	
//	write a program to find the power of a number;
	static int pow =1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number a : ");
		int a = sc.nextInt();
		System.out.println("Enter Number b : ");
		int b = sc.nextInt();
		getPower(a,b);
		System.out.println("Power of Number is : " + pow);
		
	}
	public static void getPower(int a , int b) {
		if(b>0) {
			pow = pow * a;
			getPower(a,b-1);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
//	WAJP to print the difference between biggest and smallest.
	
//	static int big =0;
//	static int small=9;
//	public static void test(int n) {
//		while(n>0) {
//			int rem = n % 10;
//			if(rem>big) {
//				big=rem;
//			}
//			if(rem<small) {
//				small =rem;
//			}
//			n = n/10;
//			test(n);
//			
//		}
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Number : ");
//		int n = sc.nextInt();
//		test(n);
//		System.out.println("Biggest Number : " + big);
//		System.out.println("Smallest Number : " + small);
//		int diff = big - small;
//		System.out.println("Difference is : " + diff);
//	}
	
	
	
	
	
	
	
	
	
}

	
	//Q 11 : WAJP to print a number is Palindrome Number
/*	static int rev =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit to reverse :");
		int d = sc.nextInt();
		reverse(d); 
		
		if(rev ==d) {
			System.out.println(d + " Is a Panildrome Number");
		}
		else {
			System.out.println(d + " Is a not Panildrome Number");
		}
		
	
	
	}
	public static void reverse(int n) {
		
	 
		if(n >0) {
			rev = rev * 10 + n%10;
			 n= n/10;
			reverse(n);
			
			}	
		
	}
	
}*/
	
	
	
	
	
	
	//Q 10 : WAJP to print reverse of a number :
/*	static int rev =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit to reverse :");
		int d = sc.nextInt();
		reverse(d);
		System.out.print(rev);
	
	
	}
	public static void reverse(int n) {
		
	 
		if(n >0) {
			rev = rev * 10 + n%10;
			 n= n/10;
			reverse(n);
			
			
		}
	
		
	}
}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Q 9: Print a digit of a sum of Number is :
	/*static int sum =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit : ");
		int d = sc.nextInt();
		sumDigit(d);
		System.out.println("Sum of diigt is : " + sum);
	}
	public static void sumDigit(int n) {
		if(n>0) {
			int rem = n%10;
			sum = sum + rem;
			sumDigit(n/10);
		}
		
	}*/
	
	
	
	
	
	
	
	
	
	
	//Q 8 :Print a digit of count a number
	/*static int count =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Digit :");
		int d = sc.nextInt();
		count(d);
		System.out.println("Count of digit is : " + count);
	}
	public static void count(int n) {
		if(n>0) {
			count(n/10);
			count++;
			
		}
	}*/
	
	
	
	
	
	
	
	

	

	//Q 6: Print the factorial of a number::
	
	/*static int fact =1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Factorial No :");
		int f = sc .nextInt();
		printFact(1 , f);
		System.out.println( f + "!" + " = " + fact);
	}
	
	public static void printFact(int n , int f ) {
		if(n<=f) {
			fact = fact * n;
			printFact(n+1 , f);
		}
		
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	//Q 5 : WAJP to print squares of number from 1 to 50 by using recursion.
	
	/*static int sum =0;
	public static void main(String[] args) {
		printSum(1);
		System.out.println("Sum of squares is : " + sum);
	}
	
	public static void printSum(int n) {
		
		if(n<=100) {
			sum = sum + n*n;
			printSum(n +1);
		}
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	//Q: Print Sum of Number is :
   /* static int sum =0;
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i = sc.nextInt();
		print(t , i);
		System.out.println("Sum of Num is : " + sum);
	}
	
	public static void print(int n , int i)
	{
		if(i<=n) {
			sum = sum + i;
			print(n , i+1);
		}
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


/*//Q 1 : WAJP to print all the numbers from 1 to 100 by using recursion.



	public static void main(String[] args) {
		System.out.println("Main Starts");
		print(1);
		System.out.println("Main Ends");

	}
	
	public static void print(int n) {
		if(n<=100) {
			System.out.print(n + " ");
			print(n+1);
		}
	}*/


	
	
	
	//Q: 2 WAJP to generate all the number from 100 to 1
	
	/*public static void main(String[] args) {
		print(100);
		
	}
	
	public static void print(int n) {
		if(n>0) {
			System.out.print(n + " ");
			print(n-1);
		}
		
	}*/
	
	
	
	//Q: 3 WAJP to generate table of a number by using recursion
	
/*	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print table : ");
		System.out.println("Enter a number i : ");
		int i = sc.nextInt();
		int t = sc.nextInt();
		print(t , i);
		
		
	}
	
	public static void print(int t , int i) {
		
		if(i<=10) {
			System.out.println(t + " * " + i + " = " + t*i);
			print(t , i +1);
			
		}
		
	}*/
	
	
	
	//Q : 4 WAJP to print sum of no: from 1 to 

	
	/*static int sum =0;
	public static void main(String[] args) {
		print(1);
		System.out.println( " Sum of Num is : " + sum);
		}
	public static void print(int n) {
		
		if(n<=100) {
			sum = sum +n;
			print(n + 1);
			
		}
	}*/
	
	
	
	
	 
	
	






