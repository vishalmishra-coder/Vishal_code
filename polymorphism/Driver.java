package polymorphism;

public class Driver {
	public static void main(String[] args) {
		Shape s1 = new Circle();
		Shape s2 = new Rectangle();
		Shape s3 = new Triangle();
		s1.area();
		s2.area();
		s3.area();
	}
	 

}
