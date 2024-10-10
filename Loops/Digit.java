package Loops;

public class Digit {
	
	/*public static boolean eachDigit(String n)
	{
		//Q1 : WAJP to print each digits of a number one by one. (n = 564784)
		while(n>0)
		{
			int rem = n % 10;
			System.out.println(rem);
			n = n /10;
			
		}*/
		
		
		
		//Q2 : WAJP to print all even digits
		/*while(n>0)
		{
			int rem = n % 10;
			if(rem % 2 ==0)
			{
				System.out.println(rem);
			}
			n = n /10;
		}*/
		
		
		//Q3 : WAJP to print all odd digits
		/*while(n>0)
		{
			int rem = n % 10;
			if (rem % 2==1) {
				System.out.println(rem);
			}
			n = n /10;
		}*/
		
		
		
		//Q4 : WAJP to print all the digits greater than 5
		/*while(n>0)
		{
			int rem = n%10;
			if(rem > 5) {
				System.out.println(rem);
			}
			n = n/10;
		}*/
		
		
		
		//Q5 : WAJP to count the number of digit in a number.
		/*int count =0;
		while(n>0)
		{
			int rem = n%10;
			count++;
			n = n/10;
		}
		System.out.println("Total Number is : " + count);*/
		
		
		
		//Q6 :WAJP to count even digits in a number.
		/*int count =0;
		while(n>0) {
			int rem = n %10;
			if(rem %2 ==0) {
				count++;
			}
			n = n/10;
		}
		System.out.println("Total Number is : " + count);*/
		
		
		
		//Q7 : WAJP to count odd digits in a number.
		/*int count =0;
		while(n>0)
		{
			int rem = n%10;
			if (rem %2 ==1)
			{
				count++;
			}
			n = n /10;
		}
		System.out.println("Total Number is : " + count);*/
		
		
		//Q8 : WAJP to print the biggest digit of a number.
		
		/*int big =0;
		while(n>0)
		{
			int rem = n%10;
			if(rem > big) {
				big = rem;
			}
			n = n/10;
		}
		System.out.println("Biggest Number is : " + big);*/ 
		
		
		//Q9 : WAJP to print the difference between biggest and smallest number.
		
		/*int big =0;
		int small = 9;
		while(n > 0)
		{
			int rem = n%10;
			if(rem>big)
			{
				big = rem;
			}
			if(rem < small)
			{
				small = rem;
			}
			n = n/10;
			 
		}
		System.out.println("Biggest Number : " + big);
		System.out.println("Smallest Number : " + small);
	    System.out.println("Difference is : " + (big -small));	*/
		
		
		
		
		//Q10 : WAJP to check whether the product of all the digits of a number is even or odd.
		
	/*	public static boolean checkProduct(int  n)
		{
			while( n > 0 )
			{
				int rem = n%10;
				if(rem%2 == 0)
				{
					return true;
				}
				
				n=n/10;
				
			
				
			}
			return false;
		}*/
		
				
		
		//Q11 : WAJP to calculate the sum of each digit of a number
		/*int sum =0;
		while(n > 0) {
			int rem = n % 10;
			sum =  sum + rem;
			n = n /10;
		}
		System.out.println("Sum is : " + sum);*/
		
		
		//Q12 : WAJP to calculate the sum of all even digits of a number.
	/*	int sum =0;
		while (n>0)
		{
			int rem = n%10;
			if(rem %2 ==0)
			{
				sum = sum + rem;
			}
			n = n /10;
		}
		System.out.println("Even Number Sum is : " + sum);*/
		
		
		
		//Q13 : WAJP to calculate the factorial of each digits of the number.
		
		
		/*while (n >0)
		{
			int rem = n%10;
			int fact =1;
			int i =1;
			while(i<=rem) {
			fact = fact * i;
			i++;
			}
			n= n /10;
			System.out.println( rem + " ! = " + fact);
		}*/
		
		
		//Q14 : WAJP to calculate the sum of factorials of each digit of number.
		
	/*	int sum =0;
		while(n>0) {
			int rem = n%10;
			int fact =1;
			int i =1;
			while(i <= rem) {
				fact = fact * i;
				i++;
			}
			System.out.println(rem + "! = " + fact);
			sum = sum + fact;
			n=n/10;
			
		}
		System.out.println("Sum of factorials is : " + sum);*/
		
		
		
		
		/*Strong Number =If the sum of factorials of each digit of the number is equals to number itself then it is called
		the strong number.*/
		//Q15 : WAJP to check whether the number is Strong Number or not
		
	/*	int sum =0;
		while(n>0)
		{
			int rem = n%10;
			int fact =1;
			int i =1;
			while(i<=rem) 
		
		    {
				fact = fact *i;
				i++;
			}
			System.out.println(rem + "! = " + fact);
			sum = sum + fact;
			n = n/10;
		}
		return sum;*/
		
		
		
		
		//Q16 : WAJP to reverse a Number.
	/*	
	    int rev = 0;
		while(n>0)
		{
			int rem = n % 10;
			rev = 10 *rev + rem;
			n = n/10;
			
			}
		return rev;
		
		*/
		
		
		
		
		//Q17 : WAJP to check whether the number is Palindrome Number or not.
		/*	int rev = 0;
		while(n>0)
		{
			int rem = n % 10;
			rev = 10 *rev + rem;
			n = n/10;
			
			}
		return rev;*/
		
		
		
		//Q18 : Take a String input from user and print all the characters one by one from starting.
		/*int i = 0;
		while (i < n.length()) {
			System.out.println(n.charAt(i));
			i++;
			
		}*/
		
		
		//Q19 : Take a string input from user and print each character of the string in reverse order.
		/*int i = n.length() - 1;
		while (i >=0) {
			System.out.println(n.charAt(i));
			i--;
		}*/
		
		
		
		//Q20 : Take a string input from user and print the reverse string of it.
		/*String rev = "";
		int i = n.length() - 1;
		while (i>=0) {
			rev = rev + n.charAt(i);
			i--;
		}
		System.out.println("reverse string is : " + rev);*/
		
		
		//21 : Take a string input and print the string is palindrome or not.
		//String s1 = n.toLowerCase();
	/*public static boolean isPalindrome(String s) {
		String rev = "";
		int i = s.length() -1;
		while(i>=0) {
			rev = rev + s.charAt(i);
			i--;
		}
		System.out.println("Reverse String is : " + rev);
		
	
		return s.equalsIgnoreCase(rev);
	}*/
	
	
	//Q22 : Take a string input and count how many vowel characters are there
	
	/*public static  void countAlphabet(String s)
	{
		int i =0;
		int count = 0;
		while (i<s.length()) {
			char c  = s.charAt(i);
			if((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') ) {
				count ++;
			}
			i++;
			 
		}
		System.out.println("total number of vowel is : "  + count);*/
	
	
	
	//Q23 : Take a string input and count the number of consonant characters
	
/*	public static  void countAlphabet(String s)
	{
		int i =0;
		int count = 0;
		while (i<s.length()) {
			char c  = s.charAt(i);
			if(!((c == 'a') || (c == 'e' ) || (c == 'i') || (c == 'o') || (c == 'u'))) 
			{
			
			count ++;
			
			}
			i++;	 
		}
		System.out.println("total number of consonant is : "  + count);*/
		
		
		
			
		
	}
	
		
		
		

		
		
		
	
		
		
		
		
		
		
	
		
		
		
	
	
	

