package Module_Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement menubar;
	@FindBy(xpath="//a[@id='logout_sidebar_link']") private WebElement logout;
	
 public	HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
 
 public void MenuBtn() {
	 menubar.click();
	
}
 
 public void LogoutBtn() {
	 logout.click();
	
}
 
 

}
