package abstraction;

public class Main {
	public static void main(String[] args)
	{
		Vehicle v1 = new ElectricCar("BMW" , 2345.434 , 240 , 24);
		v1.stop();
		ElectricCar e1 = (ElectricCar)v1;
		System.out.println(e1.name);
		System.out.println(e1.price);
		System.out.println(e1.hp);
		e1.playMusic();
		e1.openGate();
		Car c1 = (Car)v1;
		c1.stop();
		
		c1.openGate();
		
		
		
		
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
