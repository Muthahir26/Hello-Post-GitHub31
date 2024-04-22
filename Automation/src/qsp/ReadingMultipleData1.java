package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.simple.SimpleLogger;
public class ReadingMultipleData1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		 int rowCount = wb.getSheet("InvalidLogin").getLastRowNum();
		 int cellCount = wb.getSheet("InvalidLogin").getRow(0).getLastCellNum();
		 
		 for (int i = 1; i < rowCount; i++) {
			 for (int j = 0; j < cellCount; j++) {
        String un=wb.getSheet("InvalidLogin").getRow(i).getCell(j).getStringCellValue();		 
        String pw=wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();		 
		System.out.println(un);
		 }}
	}
}
