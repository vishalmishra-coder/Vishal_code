package Loops;
import java.util.Scanner;

public class Practice
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int mid = n/2+1;
		int star = 1;
		int space =n/2;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("* ");
				
			}
			if(i<mid) {
				star+=2;
				space--;
				
			}
			else {
				star-=2;
				space++;
			}
			System.out.println("");
		}
	
	}
	

}
