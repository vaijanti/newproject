package genlib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class DataFile {
	
	@Test
	public void data() throws EncryptedDocumentException, InvalidFormatException, IOException{
		File fl = new File("E:\\fetch\\ranu.xslx");
		FileInputStream fis = new FileInputStream(fl);
		Workbook wb =  WorkbookFactory.create(fis);
		Sheet sh = wb.createSheet("Sheet1");
		Row r =  sh.getRow(0);
		Cell cl = r.getCell(0);
		System.out.println();
	}

}
