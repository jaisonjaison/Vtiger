package com.crm.Genreicutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public  String getdataFromExcelFile(String Sheetname,int rowid,int clmid) throws EncryptedDocumentException, IOException {
		FileInputStream efil=new FileInputStream("./");
		Workbook workbook = WorkbookFactory.create(efil);
		return 	workbook.getSheet(Sheetname).getRow(rowid).getCell(clmid).getStringCellValue();
		
		
	}
	

}
