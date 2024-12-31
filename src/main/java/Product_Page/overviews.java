package Product_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class overviews {
	@FindBy(xpath="//button[@id='finish']") private WebElement finisBtn;
	
public	overviews(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void FinishBtn() {
	
	finisBtn.click();
	
}
	

}
