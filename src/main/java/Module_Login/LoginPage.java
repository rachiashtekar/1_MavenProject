package Module_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//input[@id='user-name']")  private WebElement UN;


	@FindBy(xpath="//input[@id='password']")  private WebElement PWd;


	@FindBy(xpath="//input[@id='login-button']")  private WebElement CLikBtn;

	public	LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);

	}

	public void username(String UserName) {
     UN.sendKeys(UserName);
	}

	public void password(String Password) {
    PWd.sendKeys(Password);
	}

	public void submitBtn() {
		CLikBtn.click();

	}
}
