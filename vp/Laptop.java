package vp;

public class Laptop {
	String name ;
	double price;
	double weight;
	int version;
	String color;
	Laptop(String name , double price ,double weight , int version , String color )
	{
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.version = version;
		this.color = color;
		
	}
	public void getDetails()
	{
		System.out.println("==============Laptop Details===================");
		System.out.println("Laptop Name is :" + name);
		System.out.println("Laptop price is :" + price);
		System.out.println("Laptop weight is :" + weight);
		System.out.println("Laptop version is :" + version);
		System.out.println("Laptop color is :" + color);
	}

}
