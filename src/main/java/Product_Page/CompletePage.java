package Product_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletePage {
	
	@FindBy(xpath="//h2[@class='complete-header']") private WebElement complete;
	
	public	CompletePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void CompleteProcess() {
	String text =complete.getText();
		System.out.println(text);
	}


}
