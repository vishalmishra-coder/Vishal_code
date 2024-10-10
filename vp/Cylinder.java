package vp;

public class Cylinder {
	
	double r;
	double h;
	
	public void setDetails(double r , double h)
	
	{
		this.r =r;
		this.h = h;
	}
	public void volumeCylinder()
	{
		System.out.println("Volume of cylinder is : " + 3.14*r*r*h);
	}
	public void lateralSurface() 
	{
		System.out.println("Lateral Surface of cylinder is : " + 2*3.14*r*h);
	}
	public void totalSurface() 
	{
		System.out.println("Total Surface of cylinder is : " + (2*3.14*r*h + 2*3.14*r*r));
		System.out.println("=======================");
	}
	
	
	
	public static void main(String[] args)
	{
		Cylinder c1 = new Cylinder();
		c1.setDetails(4, 8);
		c1.volumeCylinder();
		c1.lateralSurface();
		c1.totalSurface();
		Cylinder c2 = new Cylinder();
		c2.setDetails(8, 9);
		c2.volumeCylinder();
		c2.lateralSurface();
		c2.totalSurface();
	}

}
