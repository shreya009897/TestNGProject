package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MsExcelSheet {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook WB = null;
		XSSFSheet WS;
		File f1 = new File("C:\\Users\\tanma\\Desktop");
		FileInputStream fn = new FileInputStream(f1);
		WB = new XSSFWorkbook(fn);
		WS = WB.getSheetAt(0);
		int R = WS.getLastRowNum();
		int c = WS.getRow(0).getLastCellNum();
		for(int i=0; i<R;i++) {
			
			for(int j =0; j<c;j++) {
				System.out.println(WS.getRow(i).getCell(j).toString());
				System.out.println("\t");
			}
			System.out.println("\n");
			WB.close();
			
		}
	}
}
