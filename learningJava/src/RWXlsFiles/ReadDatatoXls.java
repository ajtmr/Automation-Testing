package RWXlsFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDatatoXls {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\learningJava\\src\\com\\rcv\\setData\\testData.xls");
		FileInputStream fis = new FileInputStream(f);
		 
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheetAt(0);
		/*
		 * Row r0=sheet.getRow(0); Cell c0=r0.getCell(1); System.out.println(c0);
		 */

		for (Row row : sheet) 
		{
			for (Cell cell : row) 
			{ 
				switch (cell.getCellType()) 
				{
				case STRING:
					System.out.print(cell.getStringCellValue()+" ");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue()+" ");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+" ");
					break;
				default:
					break;

				}

			}
			System.out.println();

		}
		
		fis.close();
	
	}
}
