package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {
	
	public static void data_Write() throws Throwable {
		
		File f = new File("C:\\Users\\sivam\\eclipse-workspace\\Maven_Project\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet createSheet = w.createSheet("New Sheet");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("Name");
		
		w.getSheet("New Sheet").getRow(0).createCell(1).setCellValue("Id");
		
		w.getSheet("New Sheet").createRow(1).createCell(0).setCellValue("Iswar");
		
		w.getSheet("New Sheet").getRow(1).createCell(1).setCellValue("i001");
		
		w.getSheet("New Sheet").createRow(2).createCell(0).setCellValue("Kathir");
		
		w.getSheet("New Sheet").getRow(2).createCell(1).setCellValue("k001");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		
		w.close();
			

	}
	
	public static void main(String[] args) throws Throwable {
		
		
		data_Write();
		
		
	}
	
	
	
}
