package constructor;

public class Employ {
	//Constructor Overloading
	/*String name;
	int id;
	double salary;
	
	Employ(String name , int id , double salary)
	{
		
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	Employ ()
	{
		
		
	}
	Employ (String name)
	{
		this.name = name;
	}
	public void getDetails()
	{
		System.out.println("========Employ Details==================");
		System.out.println(this);
		System.out.println("Name of Employ is :" + name);
		System.out.println("Id of employ is : " + id);
		System.out.println("Salary of employ is : " + salary);
	}
	
	
	
	
	
	
	
	
	
	//Copy Constructor (A Constructor which is used to copy the details of another constructor is called copy constructor)
	String name;
	int price;
	double weight;
	
	Employ()
	{
		System.out.println(" No Arguement Constructor");
	}
	Employ(String name , int price , double weight)
	{
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	Employ(Employ e)
	{
		this.name = e.name;
		this.price = e.price;
		this.weight = e.weight;
	}
	public void getDetails()
	{
		System.out.println("Name of Employ is : " + name);
		System.out.println("Price of Employ is : " + price);
		System.out.println("Weight of Employ is : " + weight);
		System.out.println("============================");
	}*/
	
	
	
	
	//Constructor Chaining
	String Emp_name;
	int Emp_id;
	double salary;
	Employ(){
		System.out.println("No - argument constructors");
	}
	
		
	
	Employ(String Emp_name , int Emp_id , double salary){
		this.Emp_name = Emp_name;
		this.Emp_id = Emp_id;
		this.salary = salary;
	}
	Employ( Employ e1){
		this.Emp_name = e1.Emp_name;
		this.Emp_id= e1.Emp_id;
		this.salary = e1.salary;
		
	}
	public void getDisplay() {
		System.out.println(Emp_name);
		System.out.println(Emp_id);
		System.out.println(salary);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
