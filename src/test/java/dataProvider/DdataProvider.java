package dataProvider;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DdataProvider {

	WebDriver driver;
	@BeforeMethod
	void browser() {
		driver = new FirefoxDriver();
		driver.get("https://www.google.com"); 
	}
		
		@Test(dataProvider = "Datastore")

		void TestCase(String s1) {
		
		WebElement e1 = driver.findElement(By.id("APjFqb"));
				e1.sendKeys(s1);
		}
		
		@DataProvider(name ="Datastore")
		public Object[][] dataPro() throws Exception {
		String File1 = "C:\\Users\\tanma\\Desktop\\Book01.xlsx";
		Object[][] d = exceldata(File1, "Sheet1");	
		return d;
		}
		

public String[][]exceldata(String File_Name, String Sheet_Name) throws Exception
{


        String data[][]= null;
		FileInputStream fn = new FileInputStream(File_Name);
		XSSFWorkbook WB = new XSSFWorkbook(fn);
		XSSFSheet WS = WB.getSheet(Sheet_Name);
		int R = WS.getLastRowNum()+1;
		int C = WS.getRow(0).getLastCellNum();
		data = new String[R-1][C];

		for(int i=1;i<=R;i++){
		for(int j=0;j<C;j++){
		  data[i][j]=WS.getRow(i).getCell(j).toString();

		}
		}
		WB.close();
		return data;
}	
		
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


