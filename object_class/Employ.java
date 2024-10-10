package object_class;

public class Employ {
	
	String name;
	int id;
	double salary;
	Employ(){
		
	}
	Employ(String name , int id , double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Name is : " + name + "\tId is : " + id + "\tSalary Is :" + salary;
	}
	

} 
