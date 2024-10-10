package vp;

public class Cuboid {
	
	double l;
	double b;
	double h;
	
	public void setValue(double l , double b , double h)
	{
		this.l =l;
		this.b =b;
		this.h =h;
	}
	public void volumeCuboid()
	{
		System.out.println("Volume of Cuboid is :" + l*b*h);
	}
	public void areaOfWalls()
	{
		System.out.println("Area Of Four Walls Of Cuboid :" +  2*(l*h + b*h));
	}
	public void totalSurface()
	{
		System.out.println("Area Of Total Surface  Of Cuboid :" +  2*(l*b + b*h + l*h));
		
		System.out.println("==================");
	}
	
	public static void main(String[] args)
	{
		Cuboid c1 = new Cuboid();
		c1.setValue(4, 6, 10);
		c1.volumeCuboid();
		c1.areaOfWalls();
		c1.totalSurface();
		Cuboid c2 = new Cuboid();
		c2.setValue(8, 12, 13);
		c2.volumeCuboid();
		c2.areaOfWalls();
		c2.totalSurface();
		Cuboid c3 = new Cuboid();
		c3.setValue(12, 16, 10);
		c3.volumeCuboid();
		c3.areaOfWalls();
		c3.totalSurface();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
