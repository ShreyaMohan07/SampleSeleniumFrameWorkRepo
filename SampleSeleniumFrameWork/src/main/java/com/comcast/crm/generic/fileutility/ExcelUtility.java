package com.comcast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
public String getDataFromExcelFile(String sheetname,int rowno,int colno) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./testdata/TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(sheetname).getRow(rowno).getCell(colno).getStringCellValue();
	wb.close();
	return data;
	
}
public int getRowCount(String sheetname) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./testdata/TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	int rowcount = wb.getSheet(sheetname).getLastRowNum();
	wb.close();
	return rowcount;
	
}
public void setDataIntoExcel(String sheetname,int rowno,int colno) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./testdata/TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheetname).getRow(rowno).createCell(colno);
	
	FileOutputStream fos =new FileOutputStream("./testdata/TestData.xlsx");
	wb.write(fos);
	wb.close();
}
}
