package encapsulation;
import java.util.Scanner;
public class Employ {
	private int s_pin = 2231;
	private String name="Vishal";
	private int id;
	private double salary;
	
	public String getName() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Pin");
		int u_pin  = sc.nextInt();
		if(s_pin == u_pin)
		{
			System.out.println("Validation is succesful");
			return name;
		}
		else;
		{
			System.out.println("Invalid Pin");
			return null;
		}
	}
	
	public void setName( String name) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Pin");
		int u_pin  = sc.nextInt();
		if(s_pin == u_pin) 
		{
			System.out.println("Validation Succesful");
			this.name = name;
		}
		else {
			System.out.println("Invalid Pin");
		}
	}
	
	public int getID() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Pin : ");
		int u_pin = sc.nextInt();
		if(s_pin == u_pin) {
			System.out.println("Validation Succesful!!");
			return id;
		}
		else {
			System.out.println("Invalid Pin");
		    return 0;
		}
	}
	
	public void setID(int id) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Pin : ");
		int u_pin = sc.nextInt();
		if(s_pin == u_pin) {
			System.out.println("Validation Successful !!");
			this.id = id;
		}
		else {
			System.out.println("Invalis Pin");
			
			
		}
	}
	
	public double getSalary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your pin : ");
		int u_pin = sc.nextInt();
		if(s_pin == u_pin) {
			System.out.println("Validation Successful !! ");
			return salary;
		}
		else {
			System.out.println("Invalid Pin");
			return 0.0;
		}
	}
	public void setSalary(double salary) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int u_pin = sc.nextInt();
		if(s_pin == u_pin) {
			System.out.println("Validation Successful!!");
			this.salary = salary;
		}
		else {
			System.out.println("Invalid Pin");
		}
	}
	

}
