package constructor;

public class EmployDriver {
	
	/*//Constructor Overloading
	public static int getSum(int a , int b)
	{
		int sum = a+b;
		
		return sum;
	}
	
	public static int demo()
	{
		System.out.println("This is Return method");
		int c = 120/2*3;
		
		return c;
	}
	
	public static void main(String[] args)
	{
	int p =30;
	int q =40;
    int sum = getSum(p ,q);
    System.out.println(" Square of sum is " + sum*sum);
    int a = demo();
    System.out.println(a);
	}
	
	
	
	
	
	
	//copy constructor
	public static void main(String [] args)
	{
		Employ e1 = new Employ();
		Employ e2 = new Employ("Vishal" ,2000 , 300.5 );
		Employ e3 = new Employ("Pawan" , 3000 , 39405.94);
		Employ e4 = new Employ("Suraj" , 4000 , 45030.930);
		Employ e5 = new Employ("Sunny" , 40493 , 37922.89);
		Employ e6 = new Employ(e2);
		Employ e7 = new Employ(e3);
		e2.getDetails();
		e3.getDetails();
		e4.getDetails();
		e6.getDetails();
		e7.getDetails();
		
		
	}*/
	
	
	
	
	
	public static void main(String[]args) {
		
	    
		Employ e1 = new Employ("Vishal" , 20 , 300049);
		Employ e2 = new Employ(e1);
		e1.getDisplay();
		e2.getDisplay();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
