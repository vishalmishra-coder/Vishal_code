package vp;

public class Employ_Driver {
	public static void main(String[] args)
	{
		System.out.println("Main methods Starts here ");
		
		Employ e1 = new Employ("Vishal " , 20 , 30000);
		Employ e2 = new Employ("Pawan " ,30 , 400000);
		Employ e3 = new Employ("Shyam" , 40 , 500000);
		e1.getDetails();
		e2.getDetails();
		e3.getDetails();
		
		
			
	}	
	
}
