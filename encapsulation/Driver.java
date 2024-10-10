package encapsulation;

public class Driver {
	
	
	//Employ Driver
	/*public static void main(String[] args) {
		Employ e1 = new Employ();
		e1.setName("Pawan");
		System.out.println("===========================");
		System.out.println("Name is : " + e1.getName());
		
		e1.setID(20);
		System.out.println("ID is : " + e1.getID());
		System.out.println("===========================");
		
		e1.setSalary(30000); 
		System.out.println("Salary is : " + e1.getSalary());
		
	}*/
	
	
	
	
	//Composition Driver
/*	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("BMW" , 2000000);
		Car c3 = new Car("Audi" , 3000 , new Engine(90));
		Car c4 = new Car("Audi", 400000 , new Engine(180));
		c1.getCarDetails();
		System.out.println("=======================");
		c2.getCarDetails();
		System.out.println("=======================");
		c3.getCarDetails();
		System.out.println("=======================");
		c3.e.getEngineDetails();
		System.out.println("=======================");
		c3.getCarDetails();
		System.out.println("=======================");
		c4.getCarDetails();
	}
	     */
	
	
	
	
	//Aggregation
	public static void main(String[] args) {
		Address a1 = new Address("Lucknow" , "up", 227828);
		Student s1 = new Student();
		
		Student s2 = new Student("Vishal" , 20 , new Address());
		s1.getStudentDetails();
		System.out.println("===============================");
		s2.getStudentDetails();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
