package com.common.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	private static XSSFWorkbook workbook;

	private static XSSFSheet excelsheet;

	private static XSSFCell excelcell;

	public static void SetExcelfile(String Filepath,String Sheetname) {

		try{
			FileInputStream file = new FileInputStream(Filepath);


			workbook = new XSSFWorkbook(file);

			excelsheet = workbook.getSheet(Sheetname);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Cannot open file");
			e.printStackTrace();
		}

	}

	public static String getcelldata(int row,int col) {
		String celldata = null;
		try {
			FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
			XSSFCell cell = excelsheet.getRow(row).getCell(col);
			cell.setCellType(CellType.STRING);
			CellValue cellvalue =  evaluator.evaluate(cell);
			celldata = cellvalue.getStringValue().toString();
			if(celldata.isEmpty()) {
				celldata = "";
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return celldata;
	}

	public static int getcolcontains(String columnname) {

		int colno ;
		int colcount = excelsheet.getRow(0).getLastCellNum();

		for(colno = 0;colno<colcount;colno++) {
			if(getcelldata(0, colno).equals(columnname)) {
				break;
			}
		}
		return colno;
	}

	public static void setcelldata(int row,int col,Object obj) {
		Cell cell = null;
		try {
			cell = excelsheet.getRow(row).createCell(col);	
		}catch(Exception e) {
			cell = excelsheet.getRow(row).getCell(col);	
		}
		if (obj instanceof String) { 
			cell.setCellValue((String)obj); 
		}else if (obj instanceof Integer) {
			cell.setCellValue((Integer)obj); 
		}else if(obj instanceof Date) {
			cell.setCellValue((Date)obj); 
		}else if(obj instanceof Double) {
			cell.setCellValue((Double)obj);
		}
	}

	public static void settestdata(String Filepath,String Classname,int row,String colname,Object value) {
		FileOutputStream fout = null;

		String sheetname = Classname;

		SetExcelfile(Filepath, sheetname);
		int colno = getcolcontains(colname);
		System.out.println("Column no is " +colno);
		setcelldata(row, colno, value);

		try {
			fout = new FileOutputStream(Filepath);

		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			workbook.write(fout);
		}catch (IOException e) {
			e.printStackTrace();
		} 
		try {
			fout.close();
		}	catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}