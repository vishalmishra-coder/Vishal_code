package interface_part;

interface SearchContext {
	
	public void findElements();
	default void start() {
		System.out.println("Default body");
	}
	default void drive() {
		System.out.println("Drive Body");
	}

}



interface WebDriver extends SearchContext{
	public void get();
}



interface JavascriptExecutor{
	public void executeScript();
}

interface TakeScreenshot{
	public void getScreenshot();
}


class RemoteWebDriver implements WebDriver,JavascriptExecutor,TakeScreenshot{
	public void findElements() {
		System.out.println("Find the element");
		
	}
	public void get() {
		System.out.println("Get the elements");
	}
	public void executeScript() {
		System.out.println("Execute the Script");
	}
	public void getScreenshot() {
		System.out.println("Take a Screen shot");
	}
}


class ChromeDriver extends RemoteWebDriver{
	
	
}
