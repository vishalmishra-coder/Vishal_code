package Loops;
import java.util.Scanner;
public class While {
	/*public static void main(String[] args)
	{
		// Q 1 : WAJP to print all the even numbers up to 100
		int i = 1;
		while (i<=100)
		{
			if(i%2==0) {
				System.out.print( i + " ");
				
			}
			i++;
		}
		
		
		
		//Q 2: WAJP to print all the numbers in a range which ends 7
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the starting range :");
		int s = sc.nextInt();
		System.out.println("enter the ending range : ");
		int e = sc.nextInt();
		int i = s;
		while( i<=e)
		{
			if(i%10==7)
			{
				System.out.println(i);
				
			}
			i++;
		}
		
		
		
		//Q 3: WAJP to print all the numbers upto 1000 which ends with 8 and also divided by 8
		
		int i = 1;
		while (i <= 1000)
		{
			if(i%10==8 && i%8==0)
			{
				System.out.println(i);
				
			}
			i++;
		}
		
		
		
		
		//Q 4: WAJP to print and count all the numbers from 1000 upto 2000 which ends with 7 and also divided by 7
		int i = 1000;
		int count = 0;
		while(i<= 2000)
		{
			if(i%10 ==7 && i%7==0)
			{
				System.out.println(i);
				
				count++;
				
			}
			
			i++;
		}
		System.out.println("Total Number is : " + count);
		
		
		
		//Q 5: WAJP to print all the factors of a number (Number itself is not included)
	
		int n = 20;
		int i = 1;
		while (i<20/2)
		{
			if(n%i ==0)
			{
				System.out.println(i);
			}
			i++;
		}
		
		
		
		
		//Q 6 : take user input and print and count all the factors of the number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int i =1;
		int count =0;
		while(i<=n/2)
		{
			if(n%i ==0) {
				System.out.println(i);
				count++;
			}
			i++;
		}
		System.out.println("Total Number of factors is : " + count);
		
		
		
		//Q 7: Take a user input and print number is prime or not
		 * soln
		 * 
		 * public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		if(checkPrime(n))
			System.out.println(n + " is a prime number");
		else
			System.out.println(n + " is not a prime number");
		
	}
	public static boolean checkPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}
		
		
		
		
		//Q 8: 1: 1+2+3+----------------------+100 (FIND THE SUM OF THE SERIES)
		 
		int i =1;
		int sum =0;
		while(i <=100)
		{
			sum = i + sum;
			i++;
			
		}
		System.out.println(sum);
		
		
		
		//Q 8 : 2: 
		int i =1;
		int sum =0;
		while(i <=100)
		{
			sum = i*i+ sum;
			i++;
			
		}
		System.out.println(sum);
		
		
		
		//Q 8 : 3:
		int i =1;
		int sum =0;
		while(i <=100)
		{
			sum = i*i*i + sum;
			i++;
			
		}
		System.out.println(sum);
		
		
		
		//Q 8: 4:
		int i =1;
		int sum =0;
		while(i <=100)
		{
			sum = i*i*i*i + sum;
			i++;
			
		}
		System.out.println(sum);
		
		
		//Q 8: 5:
		int i =1;
		int sum =0;
		while(i<=99)
		{
			sum = i*(i+1) + sum;
			i++;
		}
		System.out.println(sum);
		
		
		
		//Q 8: 6:
		int i =1;
		int sum =0;
		while(i<= 99)
		{
			sum = i *(i+1)*(i+1) + sum;
			i++;
		}
		System.out.println(sum);
		
		
		//Q 8: 7:
		int i =1;
		int sum =0;
		while(i<= 99)
		{
			sum = sum + i*i *(i+1);
			i++;
		}
		System.out.println(sum);
		
		
		
		//Q 8 : 8:
		int i =1;
		double sum =0;
		while(i<=100)
		{
			sum = sum + 1.0/i;
		
			i++;
		}
		
		System.out.println("Sum of Numbers is :" + sum);
		
		
		//Q 8 : 9:
		int i =1;
		double sum =0;
		while (i<=100) {
			sum += 1.0/i*i;
			i++;
		}
		System.out.println("Sum of Numbers is : " + sum);
		
		 
		
		
		//Q 8 : 10:
		int i =1;
		int ans =0;
		while(i<=100)
		{
			if(i%2 ==0)
			{
				ans = ans -i;
			}
			else {
				ans = ans +i;
			}
			i++;
		}
		System.out.println(ans);
		
		
		
		//Q 8 : 11:
		int i =1 ;
		double sum =0;
		while(i<=100)
		{
			if(i % 2==0)
			{
				sum = sum - 1.0/i;
			}
			else
			{
				sum = sum + 1.0/i;
			}
			
			i++;
		}
		System.out.println("Sum of Numbers is :" +sum);
		
		
		
		//Q 8 : 12:
		int i =1;
		double sum =0;
		while(i<=99)
		{
			sum = sum + 1.0/i*(i+1);
			i++;
		}
		System.out.println("Sum of Numbers is : " + sum);
		
		
		
		//Q 9 : Take a user input and print factorial of a number.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int i =1;
		int fact =1;
		while(i<=num)
		{
			fact = fact *i;
			i++;
		}
		System.out.println("Factorial Number is : " + fact);
		
		
		
		//Q 10: Take two number from user and print power of the number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num 1 :");
		int n1 = sc.nextInt();
		System.out.println("Enter a num 2 :");
		int n2 = sc.nextInt();
		System.out.println(Math.pow(n1, n2));
		
		
		//Q WAJP to print and count all the numbers upto 16 and divided by 3
		int i =1;
		int count =0;
		while (i<=16)
		{
			if(i%3 ==0) {
				System.out.println(i);
				count++;
			}
			i++;
		}
		System.out.println("Total Number is : " + count);
		
		
		
		
		//Q 7:: Take a user input and print the number is prime number or not
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		if(isPrime(n))
		{
			System.out.println(n + " It is a Prime Number");
		}
		else
		{
			System.out.println(n + " It is Not a Prime Number");
		}
		
		}
	
	public static boolean isPrime(int n)
	{
		if(n<2) {
			return false;
		}
		int i =2;
		while(i*i <=n)//while(i <=Math.sqrt(n))
		{
			if(n%i ==0)
			{
				return false;
			}
			i++;
		}
		return true;
	}*/
		
		
	
	
	
		
		
		
		
		
		
		

}
