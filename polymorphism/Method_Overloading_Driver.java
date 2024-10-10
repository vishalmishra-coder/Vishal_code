package polymorphism;

public class Method_Overloading_Driver {
	public static void main(String[] args)
	{
		method_overloading.start();
		method_overloading.start(20);
		main();
		main(20);
	}
	
	public static void main() 
	{
		method_overloading.start(20,30);
	}
	public static void main(int x) 
	{
		method_overloading.start(2000.4);
	}

}
