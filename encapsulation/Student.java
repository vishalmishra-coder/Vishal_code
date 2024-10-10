package encapsulation;

public class Student {
	String name;
	int roll_no;
	Address a;
	Student()
	{
		
	}
	Student(String name , int roll_no , Address a)
	{
		this.name = name;
		this.roll_no=roll_no;
		this.a = a;
		
	}
	public void getStudentDetails()
	{
		System.out.println("Student Name is : " + name);
		System.out.println("Student RollNo is : " + roll_no);
		System.out.println("Student address is : " + a);
	}
	

}
