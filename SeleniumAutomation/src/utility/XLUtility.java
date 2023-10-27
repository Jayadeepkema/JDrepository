package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtility {

	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook Workbook;
	public XSSFSheet Sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle Style;
	String path;

	XLUtility(String path) {
		this.path = path;
	}

	public int getRowCount(String SheetName) throws IOException {

		fi = new FileInputStream(path);
		Workbook = new XSSFWorkbook(fi);
		Sheet = Workbook.getSheet(SheetName);
		int rowcount = Sheet.getLastRowNum();
		Workbook.close();
		fi.close();
		return rowcount;
	}

	public int getcellcount(String SheetName, int rownum) throws IOException {
		fi = new FileInputStream(path);
		Workbook = new XSSFWorkbook(fi);
		Sheet = Workbook.getSheet(SheetName);
		row = Sheet.getRow(rownum);
		int cellcount = row.getLastCellNum();
		Workbook.close();
		fi.close();
		return cellcount;

	}

	public String getcellData(String SheetName, int rownum, int column) throws IOException {
		fi = new FileInputStream(path);
		Workbook = new XSSFWorkbook(fi);
		Sheet = Workbook.getSheet(SheetName);
		row = Sheet.getRow(rownum);
		cell = row.getCell(column);
		DataFormatter formatter = new DataFormatter();
		String data;
		try {
			data = formatter.formatCellValue(cell);

		} catch (Exception e) {
			data = " ";
		}
		Workbook.close();
		fi.close();
		return data;
	}

	public void SetCellData(String SheetName, int rownum, int column, String data) throws IOException {
		File Xlfile = new File(path);
		if (!Xlfile.exists())// if file not exists then create new file
		{
			Workbook = new XSSFWorkbook();
			fo = new FileOutputStream(path);
			Workbook.write(fo);

		}
		fi = new FileInputStream(path);
		Workbook = new XSSFWorkbook(fi);
		if (Workbook.getSheetIndex(SheetName) == -1)
			Workbook.createSheet(SheetName);
		Sheet = Workbook.getSheet(SheetName);
		if (Sheet.getRow(rownum) == null)// if row not exists then create new row
			Sheet.createRow(rownum);
		row = Sheet.getRow(rownum);

		cell = row.createCell(column);
		cell.setCellValue(data);
		fo = new FileOutputStream(path);
		Workbook.write(fo);
		Workbook.close();
		fi.close();
		fo.close();

	}

	public void fillGreencolour(String SheetName, int rownum, int column) throws IOException {
		fi = new FileInputStream(path);
		Workbook = new XSSFWorkbook(fi);
		Sheet = Workbook.getSheet(SheetName);
		row = Sheet.getRow(rownum);
		cell = row.getCell(column);
		Style = Workbook.createCellStyle();
		Style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		Style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(Style);
		Workbook.write(fo);
		Workbook.close();
		fi.close();
		fo.close();

	}

	public void fillRedcolour(String SheetName, int rownum, int column) throws IOException {
		fi = new FileInputStream(path);
		Workbook = new XSSFWorkbook(fi);
		Sheet = Workbook.getSheet(SheetName);
		row = Sheet.getRow(rownum);
		cell = row.getCell(column);
		Style = Workbook.createCellStyle();
		Style.setFillForegroundColor(IndexedColors.RED.getIndex());
		Style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(Style);
		Workbook.write(fo);
		Workbook.close();
		fi.close();
		fo.close();

	}

}
