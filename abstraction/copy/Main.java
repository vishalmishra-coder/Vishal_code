package abstraction.copy;

public class Main {
	public static void main(String[] args)
	{
		Car c1 = new ElectricCar("Tesla", 2000000, 200 , 120);
		ElectricCar e1= (ElectricCar)c1;
		c1.openGate();
		c1.start();
		c1.drive();
		System.out.println(c1.price);
		System.out.println(c1.name);
		System.out.println(e1.volt);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//For Two D Shape Class
	/*public static void main(String[] args) {
		TwoDShape t1 = new Circle();
		Circle c1 = (Circle)t1;
		TwoDShape t2 = new Rectangle();
		t1.getArea();
		t2.getArea();
		c1.getArea();
	}*/

}
