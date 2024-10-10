package abstraction;

abstract class TwoDShape
{

	public abstract void getArea();
}
 class Circle extends TwoDShape
 
{
	public void getArea()
	{
		System.out.println(" Area Of Circle is : 2*pi*r*r "); 
		
	}
	
	
	
}

class Rectangle extends TwoDShape
{
	public void getArea() {
		System.out.println("Area of Rectangle is : l*w");
	}
}


