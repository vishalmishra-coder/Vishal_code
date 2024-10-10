package vp;

public class Driver {

	public static void main(String[] args)
	{
		/*Laptop l1 = new Laptop("Dell" , 250000 , 1.4 , 2024 , "Grey");
		l1.getDetails();
		Student s1 = new Student("Vishal" , 92 , 5.9 , 989403);
		s1.getDetails();
		Vehicle v1 = new Vehicle("Car" , 2800000 , "Light Blue");
		v1.getDetails();*/
		
		
		
		//Static Class
		System.out.println("The value of outer class x is : " + outer.x);
		System.out.println("The Value of inner class x is : " + outer.Inner.y );
		outer.test();
		outer.Inner.demo();
		outer o = new outer();
		
		
	}

}
