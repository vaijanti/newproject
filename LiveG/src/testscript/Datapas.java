package testscript;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datapas {
static String regid = null;
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		File src = new File("E:\\ranu\\LiveG\\A.xlsx");
		FileInputStream fi= new FileInputStream(src);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh= wb.getSheet("Testcase");
		
		for(int i=0; i<=sh.getLastRowNum();i++)
		{
			if(sh.getRow(i).getCell(i).getStringCellValue().endsWith("y")){
			String pr =sh.getRow(0).getCell(0).getStringCellValue();
			System.out.println(pr);
			
	   }}

	}
	}
