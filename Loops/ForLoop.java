package Loops;
import java.util.Scanner;
public class ForLoop {
	/*public static void main(String[] args)
	{
		
		/*for(int i =1; i<=10; i++)
		{
			System.out.println(i);
		}*/
		
		
		
		//Q : Write a java program to print 1 to 100 which is not divisible by 3
		/*for(int i =1; i<=100; i++) {
			if(i%3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		}*/


		
		
		
		//Q : Write a java program to calculate count digit.
	
	/*public static void main(String[] args)  {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		count(num);
		System.out.println(count(num));
		
	}
	
	public static int count(int n)
	{
		int count =0;
		while(n>0)
		{
			count++;
			n = n /10;
		}
      //System.out.println("total count is : " + count);
		return count;
		
		}*/
	
	
	
	
	//Q : Take a user input and print table of that number
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		printTable(n);
	}
	public static void printTable(int n) {
	for(int i =1; i<=10; i++){
		System.out.println(i + "*" + n + " = " +  i*n);
	}
	
	}*/
	
	
	
	//Q : Take a number from user and print table upto that number starting from one.
/*	public static void  main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printTableUpto(n);
		
	}
	
	
	public static void printTableUpto(int n) {
		for(int i=1; i<=n; i++) {
			for(int j =1; j<=10; j++) {
				System.out.println(j + "*" + i + " = " + j*i);
				
			}
			System.out.println("========================");
		}
	}*/
	
	
	
	
	/*//Q : Take a user input and print whether the number is a perfect number or not
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number :");
		 int n = sc.nextInt();
		 if(checkPerfectNumber(n)) 
			 System.out.println("It is a Perfect Number");
		 else
			 System.out.println("It is Not a Perfect Number");
			 }
	 
	 public static boolean checkPerfectNumber(int n) {
		 int sum =0;
		 for(int i =1; i<=n/2; i++) {
			 if(n%i==0) {
				 sum = sum +i;
				 }
			  }
		 return sum==n;
	 }*/
	
	
	
	
	//Q : Write a Java Program to print factorial of all the number upto 15
	/*public static void main(String[] args) {
		for(int i =1; i<=15; i++) {
			System.out.println(i + " ! = " + getFactorial(i));
			
		}
		
	}
	
	
	public static int getFactorial(int n) {
		int fact =1;
		for(int i =1; i<=n; i++) {
			fact = fact * i;
		}
		return fact;
	}*/
	
	
	
	//Q : Write a java program to calculate sum of factorials of all the numbers upto 10
	
	/*public static void main(String[] args) {
		int sum =0;
		for(int i =1; i<=10; i++) {
			System.out.println(i + "!=" + getFactorial(i) );
			sum = sum + getFactorial(i);
			
		}
		System.out.println("Sum of Factorial is : " + sum);
	}
	
	
	
	public static int getFactorial(int n) {
		int fact =1;
		for(int i =1; i<=n; i++) {
			fact = fact * i;
		}
		return fact;
	}*/
	
	
	
	//Q 
	/*    output = 0 0 0 0 0
	               1 1 1 1 1
	               0 0 0 0 0
	               1 1 1 1 1
	               0 0 0 0 0*/
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		print(n);
	}
	public static void print(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print((i-1)%2 + " ");
			}
			System.out.println();
		}
	}*/
	
	
	
	//Q :
	/*   output = 0 1 0 1 0 1
	 *            0 1 0 1 0 1
	 *            0 1 0 1 0 1
	 *            0 1 0 1 0 1
	 *            0 1 0 1 0 1
	 */
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		print(num);
	}
	public static void print(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print((j-1)%2 + " ");
			}
			System.out.println();
		}
	}*/
	
	
	//Q : 
	/*(1,1) (1,2) (1,3) (1,4) (1,5)
	
	(2,1) (2,2) (2,3) (2,4) (2,5)
	
	(3,1) (3,2) (3,3) (3,4) (3,5)
	
	(4,1) (4,2) (4,3) (4,4) (4,5)
	
	(5,1) (5,2) (5,3) (5,4) (5,5)*/
	
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		printNum(n);
	}
	public static void printNum(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("(" + i + "," + j + ")" + " ");
			}
			System.out.println();
		}
	}*/
	
	
	
//Q :  
	/*  output = * * * * * * * *
	 *           *             *
	 *           *             *
	 *           *             *
	 *           * * * * * * * *
	 */
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		hollowStar(n);
	}
	public static void hollowStar(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1|| i==n||j==1||j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}*/
	
	
	
	//Q : 
	
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		hollowStar2(n);
		
	}
	public static void hollowStar2(int n) {
		
		for(int i =1; i<=n; i++) {
			for(int j =1; j<=n; j++) {
				if(i<=2 || i>=n-1 || j<=2 || j>=n-1 )
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
			
		}
	}*/
	
	
	
	
	//Q
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		midStar(n);
	}
	public static void midStar(int n) {
		if(n % 2 ==0) {
			System.out.println("Invalid Number");
			return;
		}
		int mid =n/2 + 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==mid || j==mid)
					System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}*/
	
	
	
	//Q :
	
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		crossStar(num);
	}
	public static void crossStar(int n) {
		for(int i=1; i<=n; i++) {
			for(int j =1; j<=n; j++) {
				if(i==j || i+j == n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
					
			}
			
			System.out.println();
		}
	}*/
	
	
	
	
	//Q :
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n =sc.nextInt();
		allStar(n);
	}
	public static void allStar(int n) {
		int mid = n/2 + 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1||i==n||j==1||j==n|| i==mid || j==mid || i==j || i+j==n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}*/
	
	
	
	//Q :
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		swastikStar(n);
	}
	public static void swastikStar(int n) {
		int mid = n/2+1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==mid||j==mid || j>mid && i==1 || j<mid && i==n || i>mid && j==n || i<mid && j==1)
					System.out.print("* ");
				else
					System.out.print("  ");
					
			}
			System.out.println();
		}
	}*/
	
	
	
	
	
	
	
		
	
	
	
	


}
