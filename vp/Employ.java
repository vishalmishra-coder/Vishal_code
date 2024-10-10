package vp;


public class Employ {
	String name;
	int id;
	double salary;
	Employ(String name , int id , double salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void getDetails()
	{
		System.out.println("Object address is :" + this);
		System.out.println("Name of Employ is : " + name);
		System.out.println("Id of Employ is :" + id);
		System.out.println("Salary of Employ is " + salary);
		System.out.println("===========================");
	
}
}

	
	
	
	
	
	
            
	
	

