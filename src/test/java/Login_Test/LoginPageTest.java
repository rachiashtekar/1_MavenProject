package Login_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module_Home.HomePage;
import Module_Login.LoginPage;
import Product_Page.CompletePage;
import Product_Page.ProductPage;
//BeforeClass
//BeforeMthod
//Test
//AfterMethod
//AfterClass
import Product_Page.YourCart;
import Product_Page.YourInfo;
import Product_Page.overviews;
public class LoginPageTest extends BaseClass {
	
	LoginPage login;
	HomePage  home;
	ProductPage product;
	YourCart cart;
	YourInfo information;
	overviews overview;
	CompletePage complete;
	int TCID;
	
   @BeforeClass
	public void OpenBrowser() throws InterruptedException {
		IntilizeBrowser();
		
		login = new LoginPage(driver);
		home = new HomePage(driver);
		product = new ProductPage(driver);
		cart = new  YourCart(driver);
		information = new YourInfo(driver);
		overview = new overviews(driver);
		complete=new CompletePage(driver);
		
		Thread.sleep(2000);
		
	}
	
   @BeforeMethod
	public void LoginToApp() throws EncryptedDocumentException, IOException, InterruptedException {
		login.username(UtilityClass.GetData(0, 0));
		login.password(UtilityClass.GetData(0, 1));
		login.submitBtn();
		Thread.sleep(2000);
	}
	
   @Test
	public void ClickOnBtn() throws EncryptedDocumentException, IOException, InterruptedException {
		 TCID=101;
		product.AddCart();
		Thread.sleep(2000);
		product.ShowCartBtn();
		Thread.sleep(2000);
		cart.Chekout();
		Thread.sleep(2000);
		information.FirstName(UtilityClass.GetData(4, 0));
		Thread.sleep(2000);
		information.LastName(UtilityClass.GetData(4, 1));
		Thread.sleep(2000);
		information.PostalCode(UtilityClass.GetData(4, 2));
		Thread.sleep(2000);
		information.ContinueButton();
		Thread.sleep(2000);
		overview.FinishBtn();
		Thread.sleep(2000);
		complete.CompleteProcess();
		
		
		
		
	}	
	
   @AfterMethod
	public void LogOutApp(ITestResult S1) throws InterruptedException, IOException {
		
	   if(S1.getStatus()==ITestResult.FAILURE) 
		{
			UtilityClass.getScreenshot(driver, TCID);
		}
	   
	   
	    home.MenuBtn();
		home.LogoutBtn();
		Thread.sleep(2000);
		
	}
	
	@AfterClass
   public void CloseBrowser() {
	   driver.quit();
	   
	
    }

}
