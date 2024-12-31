package Product_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement  AddToCartBtn;
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement ShowCart;
	
 public	ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
 
 public void AddCart() {
	 AddToCartBtn.click();
	
}
 
 public void ShowCartBtn() {
	 ShowCart.click();
	
}
	

	

}
