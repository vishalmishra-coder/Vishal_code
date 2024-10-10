package vp;

public class Student {
	String name;
	int rollno;
	double height;
	int phone_no;
	Student(String name , int rollno , double height , int phone_no)
	{
		this.name = name;
		this.rollno = rollno;
		this.height = height;
		this.phone_no = phone_no;
		
	}
	public void getDetails()
	{
		System.out.println("==================Student Details=====================================");
		System.out.println("Enter Student Name is :" + name);
		System.out.println("Enter Student Roll No is :" + rollno);
		System.out.println("Enter Student height is :" + height);
		System.out.println("Enter Student phone_no is :" + phone_no);
	}

}
