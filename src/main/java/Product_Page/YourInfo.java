package Product_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInfo {
	
	@FindBy(xpath="//input[@id='first-name']") private WebElement FN;
	@FindBy(xpath="//input[@id='last-name']") private WebElement LN;
	@FindBy(xpath="//input[@id='postal-code']") private WebElement PC;
	@FindBy(xpath="//input[@id='continue']") private WebElement continueBtn;
	
	public YourInfo(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public void FirstName(String firstname) {
		FN.sendKeys(firstname);
		
	}
	
    public void LastName(String Lastname) {
		LN.sendKeys(Lastname);
		System.out.println("here");
	}

    public void PostalCode(String postalCode) {
	    PC.sendKeys(postalCode);
    }
    public void ContinueButton() {
    	continueBtn.click();
		
	}

}
