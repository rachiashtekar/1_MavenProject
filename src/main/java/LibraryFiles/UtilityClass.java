package LibraryFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass {
	
	public static String GetData(int rowIndex , int collIndex) throws EncryptedDocumentException, IOException {
		
		//FileInputStream file = new FileInputStream("C:\\Users\\Welcome\\eclipse-workspace\\1_Maven_Project\\TestData\\selenium.xlsx");
		FileInputStream file=new FileInputStream("C:\\Users\\Welcome\\Desktop\\selenium.xlsx");
	Sheet sh =	WorkbookFactory.create(file).getSheet("DDF");
	
	String value = sh.getRow(rowIndex).getCell(collIndex).getStringCellValue();
	return value;
		
	}

}
