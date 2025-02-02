package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.io.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityClass {

	public static String GetData(int rowIndex , int collIndex) throws EncryptedDocumentException, IOException {

		
		FileInputStream file=new FileInputStream("C:\\Users\\Welcome\\Desktop\\selenium.xlsx");
		Sheet sh =	WorkbookFactory.create(file).getSheet("DDF");

		String value = sh.getRow(rowIndex).getCell(collIndex).getStringCellValue();
		return value;

	}
	
	
	public static void getScreenshot(WebDriver driver , int TCID) throws IOException {
		
		//File src = ( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\Welcome\\eclipse-workspace\\1_Maven_Project\\Screenshots\\Screenshot"+TCID+".png");


		System.out.println(src);
		System.out.println(dest);
		
		
		FileHandler.copy(src, dest);
	}



}
