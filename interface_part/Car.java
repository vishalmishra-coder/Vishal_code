package interface_part;
public class Car implements ElectricCar{
	public void start() {
		System.out.println("Start the vehicle");
		
	}
	public void stop() {
		System.out.println("Stop the vehicle");
	}
	public void openGate() {
		System.out.println("open the gate");
	}
	public void musicPlay() {
		System.out.println("Play music");
	}
	
	
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		ElectricCar e1 = (ElectricCar)v1;
		Car c1 = (Car)v1;
		c1.openGate();
		e1.musicPlay();
		v1.start();
		v1.stop();
		c1.drive();
		System.out.println(Vehicle.x);
		
	}
	

}
