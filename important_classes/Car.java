package important_classes;

public class Car {
	final static String brand;
	final String name;
	 double price;
	final int car_no;
	static {
		brand ="Tata";
	}
	Car(String name , double price , int car_no){
		this.name =name ;
		this.price = price; 
		this.car_no = car_no;
	}
	
	

}
