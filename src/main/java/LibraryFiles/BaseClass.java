package LibraryFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public	WebDriver driver;
	
	public void IntilizeBrowser() {
		
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
	}

}
