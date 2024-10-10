package interface_part;

 interface Vehicle {
	 
	 int x = 40;
	 default void drive() {
		 System.out.println("Drive the vehicle");
	 }
	public abstract void start();
	public abstract void stop();
	
	

}
