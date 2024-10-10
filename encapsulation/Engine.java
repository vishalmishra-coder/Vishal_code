package encapsulation;



// Composition
public class Engine
{
	int hp;
	public void start()
	{
		System.out.println("Start the Engine !!");
	}
	Engine()
	{
		
	}
	Engine(int hp)
	{
		this.hp = hp;
	}
	public void getEngineDetails() {
		System.out.println("HP of Engine is : " + hp);
		start();
	}

}
