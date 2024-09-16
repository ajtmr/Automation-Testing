package RWXlsFiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDatatoXls {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("sheet1");
		Row r00=sheet.createRow(0);
		Cell c00=r00.createCell(0);
		c00.setCellValue("RCV Academy");
		
		
		Cell c01=r00.createCell(1);
		c01.setCellValue("RCV");
		
		Row r10=sheet.createRow(1);
		Cell c10=r10.createCell(0);
		c10.setCellValue(23.0);
		
		Cell c11=r10.createCell(1);
		c11.setCellValue(true);
		
		
		
		File f=new File("C:\\Users\\HP\\eclipse-workspace\\learningJava\\src\\com\\rcv\\setData\\testData.xls");
		FileOutputStream fos=new FileOutputStream(f);
		workbook.write(fos);
		fos.close();
		workbook.close();
		
		System.out.println("File is written successfully");

	}

}
