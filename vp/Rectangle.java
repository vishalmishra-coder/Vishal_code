package vp;
import java.util.Scanner;


public class Rectangle {
	double l;
	double b;
	
	public void setDetails(double l , double b) {
		this.l= l;
		this.b =b;
		
		
	}
	public void getArea()
	{
		
		double r =l*b;
		System.out.println("Get area of rectangle :" + r);
		
	}
	public void getPerimeter() {
		
		double res= 2*(l+b);
		System.out.println("Get perimeter of Rectangle :" + res);
		System.out.println("=========================");
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		double l1= sc.nextDouble();
		System.out.println("Enter the breadth");
		double b1= sc.nextDouble();
		
		
		r1.setDetails(l1 , b1);
		r1.getArea();
		r1.getPerimeter();
		
		r2.setDetails(27 , 450);
		r2.getArea();
		r2.getPerimeter();
		
	}
	

}
