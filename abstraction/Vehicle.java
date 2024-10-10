package abstraction;

abstract class Vehicle
{
	
	String name;
	double price;
	Vehicle(){
		
	}
	Vehicle(String name , double price)
	{
		this.name = name;
		this.price = price;
		
	}
	static
	{
		System.out.println("This is a Static Block");
		
	}
	
	{
		System.out.println("This is a Non - Static Block");
	}
	
	public abstract void start();
	public abstract void drive();
	
	
	public void accelerate() {
		System.out.println("Accelerate the vehicle");
	}
	public void stop() {
		System.out.println("Stop the Vehicle");
	}

}





 abstract class Car extends Vehicle
 {
	int hp;
	Car(){
		
	}
	Car(String name , double price , int hp){
		super(name,price);
		this.hp = hp;
	}
	
	public abstract void openGate();
	public void playMusic() 
	{
		System.out.println("Play the music :");
	}
	
	
}
 
 
 
 class ElectricCar extends Car{
	 int volt;
	 ElectricCar(){
		 
	 }
	 ElectricCar(String name , double price , int hp , int volt){
		 super(name , price , hp);
		 this.volt=volt;
	 }
	 @Override
	 public void start() {
		 System.out.println("Start the electric car");
	 }
	 @Override
	 public void drive()
	 {
		 System.out.println("Drive the Electric Car");
	 }
	 @Override
	 public void openGate() {
		 System.out.println("Open the Gate");
	 }
	 
	 
	 
 }
