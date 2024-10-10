package encapsulation;

public class Car
{
	String name;
	double price;
	Engine e = new Engine();
	Car()
	{
		
	}
	Car(String name){
		this.name = name;
	}
	Car(String name , double price){
		this(name);
		this.price = price;
	}
	Car(String name , double price , Engine e){
		this(name , price);
		this.e=e;
	}
	public void getCarDetails() {
		System.out.println(" Car Name is : " + name);
		System.out.println("Car Price is : " + price);
		System.out.println("Engine e is : " + e.hp);
	}
	

}
