package vp;
import java.util.Scanner;

public class Circle
{
	
	double r ;
	
	public void setValue( double r) {
		this.r = r;
	}
	public void areaCircle() {
		System.out.println("Area of Circle is :" + 3.14*r*r);
	}
	
	public void perimeterCircle()
	{
		System.out.println("Perimeter of Circle is :" + 2*3.14*r);
		System.out.println("===========================");
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius Circle 1:");
		double r1 = sc.nextDouble();
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();
		c1.setValue(r1);
		c1.areaCircle();
		c1.perimeterCircle();
		System.out.println("Enter the radius Circle 2:");
		double r2 = sc.nextDouble();
		c2.setValue(r2);
		c2.areaCircle();
		c2.perimeterCircle();
		System.out.println("Enter the radius Circle 3:");
		double r3 = sc.nextDouble();
		c3.setValue(r3);
		c3.areaCircle();
		c3.perimeterCircle();
		
		
	}

}
