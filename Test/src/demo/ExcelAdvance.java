package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAdvance {

	public static void main(String[] args) throws Exception 
	{
		File src = new File("C:\\Selenium\\Excel\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		int rowcount = sheet1.getLastRowNum();
		System.out.println("Number of row is" + rowcount);
		
		
		
		
				
	}

}
