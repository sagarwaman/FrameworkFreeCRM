package com.common.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	private static XSSFSheet excelsheet;
	
	private static XSSFWorkbook excelworkbook1;

	private static XSSFCell excelcell;

	public static Object[][] getData(String Filepath,String Classname) throws Exception{

		String array[][] = null;
		String Sheetname = Classname;

		try {

			FileInputStream file = new FileInputStream(new File(Filepath));

			excelworkbook1 = new XSSFWorkbook(file);

			excelsheet = excelworkbook1.getSheet(Sheetname);

			int startrow = 1 ;

			int startcol = 0;

			int ci,cj;

			int totalrow = excelsheet.getLastRowNum();

			int totalcol = excelsheet.getRow(1).getLastCellNum();
			
            System.out.println(totalrow);
            System.out.println(totalcol);
            
			array = new String[totalrow][totalcol];

			ci = 0;

			for(int i = startrow;i<=totalrow;i++,ci++) {

				cj=0;

				for(int j = startcol ; j<totalcol;j++,cj++) {

					array[ci][cj] =  getcelldata(i,j);
				}
			}

		}catch (FileNotFoundException e) {

			System.out.println("File is not found on given path");
		}catch (IOException e) {
			System.out.println("Could not read excel file");
		}

		return array;

	}

	public static String getcelldata(int r,int c) throws Exception {

		try {
			excelcell = excelsheet.getRow(r).getCell(c);
            System.out.println(r +" and "+ c);
			String celldata = excelcell.getStringCellValue();
            System.out.println(celldata);
			return celldata;

		}
		catch (Exception e) {
			// TODO: handle exception

			System.out.println(e.getMessage());
			throw (e);
		}

	}

}
