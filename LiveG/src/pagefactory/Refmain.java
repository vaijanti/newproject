package pagefactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Refmain {
   static String id= null;
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		File fi= new File("E:\\ranu\\LiveG\\A.xlsx");
		
	FileInputStream fis= new FileInputStream(fi);
	Workbook wb= WorkbookFactory.create(fis);
	Sheet sh= wb.getSheet("Testcase");
	for(int i=0;i<=sh.getLastRowNum();i++)
	{
		if(sh.getRow(i).getCell(1).getStringCellValue().equals("y"));
		id= sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println(id);
		
		for(int j=0;j<=sh.getRow(0).getLastCellNum();j++)
		{
			Sheet sh1=wb.getSheet("senario");
			if(sh1.getRow(j).getCell(0).getStringCellValue().equals(id))
			{
				int k=1;
				while(k<=sh.getLastRowNum())
				{
					System.out.println(sh1.getRow(k).getCell(j+1).getStringCellValue());
				}
				k++;
			}
		}
	}
	/*Row r= sh.getRow(0);
	Cell c= r.getCell(1);
	System.out.println(c.getStringCellValue()); */
	}

}
