package vp;

public class Vehicle {
	String name;
	double price;
	String color;
	Vehicle(String name , double price , String color)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		
	}
	public void getDetails()
	{
		System.out.println("==============Vehicle Details==================");
		System.out.println("Enter the name of vehicle : " + name);
		System.out.println("Enter the price of vehicle : " + price);
		System.out.println("Enter the color of vehicle" + color);
	}

}
