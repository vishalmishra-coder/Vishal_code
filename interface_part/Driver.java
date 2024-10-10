package interface_part;

public class Driver {
	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver();
		TakeScreenshot ts=(TakeScreenshot)wd;
		ChromeDriver cd =(ChromeDriver)wd;
		cd.getScreenshot();
		 ts.getScreenshot();
	    wd.findElements();
		  wd.get();
		
	}

}
