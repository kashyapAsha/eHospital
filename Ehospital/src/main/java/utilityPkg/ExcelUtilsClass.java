package utilityPkg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilsClass {
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	//String path=null;
	/*public XlClass(String path){
		this.path=path;
	}*/
	
	public int getRowCount(String path, String sheetName) throws IOException {
		fi= new FileInputStream(path);
		wb= new XSSFWorkbook(fi);
		sheet=wb.getSheet(sheetName);
		//int rowcount= sheet.getLastRowNum();
		int rowcount= sheet.getPhysicalNumberOfRows();
		wb.close();
		fi.close();
		return rowcount;
	}
	
	public int getCellCount(String path,String sheetName, int rownum) throws IOException{
		fi= new FileInputStream(path);
		wb= new XSSFWorkbook(fi);
		sheet=wb.getSheet(sheetName);
		row=sheet.getRow(rownum);
		int cellcount= row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}
		
	public String getCellData(String path, String sheetName, int rownum, int colnum) throws IOException {
		fi= new FileInputStream(path);
		wb= new XSSFWorkbook(fi);
		sheet=wb.getSheet(sheetName);
		row=sheet.getRow(rownum);
		cell= row.getCell(colnum);
		DataFormatter formatter= new DataFormatter();
		String data;
		try {
		data=formatter.formatCellValue(cell);
		}
		catch(Exception e) {
			data="";
		}
		wb.close();
		fi.close();
		return data;

	}
	
	public void setCellData(String path, String sheetName, int rownum, int colnum, String data) throws IOException {
		fi= new FileInputStream(path);
		wb= new XSSFWorkbook(fi);
		sheet=wb.getSheet(sheetName);
		row=sheet.getRow(rownum);
		cell= row.getCell(colnum);
		cell.setCellValue(data);
		fo= new FileOutputStream(path);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}

}
