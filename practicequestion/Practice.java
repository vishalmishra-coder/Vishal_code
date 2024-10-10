package practicequestion;
import java.util.Scanner;
public class Practice 
{
	
	public static void main(String[] args)
	{
	//Write a java program to print a number which is not divisible by 3 !!
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n =sc.nextInt();
		int rev =0;
		while(n>0) {
			rev = rev*10 + n%10;
			n = n/10;
		}
		System.out.println("Reverse of a number is : " + rev);
	}
	
	
}



 

 
 



