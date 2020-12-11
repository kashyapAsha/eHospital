package testcasesPkg;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import BasePkg.BaseClass;
import utilityPkg.ExcelUtilsClass;



public class DataProviderClass extends BaseClass  {
	public DataProviderClass() {
		super();
	}
	
	ExcelUtilsClass xl=new ExcelUtilsClass();
	//String path = "C:\\Users\\admin\\eclipse-workspace\\Ehospital\\src\\main\\resources\\TestData\\registration.xlsx";
      String path= prop.getProperty("regSheetPath");
	
	@DataProvider(name="registration")
	public Object[][] getData() throws IOException{
		//xl= new ExcelUtilsClass();
		//String path = "C:\\Users\\admin\\eclipse-workspace\\Ehospital\\src\\main\\resources\\TestData\\registration.xlsx";
		int rownum=xl.getRowCount(path, "PatientRegistration");
		System.out.println("rows="+rownum);
		int colcount=xl.getCellCount(path, "PatientRegistration", 0);
		System.out.println("col="+colcount);
		int i=1;
		Object regdata[][]=new String[i][colcount];
		int ci=0;
		//for(int i=1; i<rownum; i++) {
		int cj=0;
			for(int j=0; j<colcount; j++, cj++) {
				regdata[ci][cj]=xl.getCellData(path, "PatientRegistration", i, j);
				System.out.println(regdata[ci][cj]);
			}
		//}
		
		return regdata;
		
	}
	
	

}
