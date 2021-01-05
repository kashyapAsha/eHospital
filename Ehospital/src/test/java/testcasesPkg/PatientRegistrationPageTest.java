package testcasesPkg;

import java.io.IOException;

//import java.io.IOException;

import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
//import PagesPkg.HomePageClass;
import PagesPkg.LoginClass;
import PagesPkg.PatientRegistrationClass;
import utilityPkg.ExcelUtilsClass;

public class PatientRegistrationPageTest extends BaseClass {
	ExcelUtilsClass xl;
	LoginClass loginclass;
	//String path = "C:\\Users\\admin\\eclipse-workspace\\Ehospital\\src\\main\\resources\\TestData\\registration.xlsx";
	String path="";
	//HomePageClass homepage;
	PatientRegistrationClass patientRegistration;
	
	public PatientRegistrationPageTest() {
		super();
	}

	@BeforeTest
	public void setup() throws InterruptedException {
		initialization();
		loginclass= new LoginClass();
		loginclass.login(prop.getProperty("username"), prop.getProperty("password"));
		xl= new ExcelUtilsClass();
		path = prop.getProperty("regSheetPath");
		//homepage= new HomePageClass();
		patientRegistration = new PatientRegistrationClass();
	}
	

	@Test(dataProvider="registration", dataProviderClass=DataProviderClass.class, priority=1)
	public void verifyRegistrationOfPatientTest(String fname, String mname, String lname, String age, String mail, String loyaltyCardNo, String identityNo, String addrss, String pin, String phone1, String phone2, String postalAdress, String relative) {
		try {
			patientRegistration.registrationOfPatient(fname, mname, lname, age, mail, loyaltyCardNo, identityNo, addrss, pin, phone1, phone2, postalAdress, relative);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
			
	}

	@Test(dependsOnMethods= {"verifyRegistrationOfPatientTest"}, priority=2)
	public void getPatientUHIDTest() throws IOException {
		String uhid= patientRegistration.getPatientUHID();
		System.out.println("uhid is="+uhid);
		xl.setCellData(path, "PatientRegistration", 1, 13, uhid);
	}
	
	
	/*public void verifyPatientSearchTest() throws IOException {
		String uhid =xl.getCellData(path, "PatientRegistration", 1, 13);
		try {
			patientRegistration.verifyPatientSearch(uhid);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}*/
	@Test(dependsOnMethods= {"verifyRegistrationOfPatientTest"},priority=3)
	public void verifyClearTest() throws InterruptedException {
		patientRegistration.verifyClear();
	}
	
	@Test(priority=4)
	public void verifyFetchPatientByHandIconTest() throws IOException {
		String uhid =xl.getCellData(path, "PatientRegistration", 1, 13);
		try {
			String getName=patientRegistration.getPatientByHandIcon(uhid);
			System.out.println(getName);
			Assert.assertEquals(getName, "Ash", "patient not fetched");
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(dependsOnMethods= {"verifyFetchPatientByHandIconTest"}, priority=5)
	public void verifyPrintPatientInfoTest() {
		Boolean flag;
		try {
			flag = patientRegistration.verifyPrintPatientInfo();
			Assert.assertTrue(flag, "print patient info error");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	public void verifyPrintRegistrationCardTest() {
		Boolean flag;
		try {
			flag = patientRegistration.verifyPrintPatientInfo();
			Assert.assertTrue(flag, "print registration card error");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)
	public void verifyCompanyDocumentTest() {
		Boolean flag;
		try {
			flag = patientRegistration.verifyCompanyDocument();
			Assert.assertTrue(flag, "company document error");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(priority=8)
	public void verifyPrintLoyaltyCardTest() {
		Boolean flag;
		try {
			flag = patientRegistration.verifyPrintLoyaltyCard();
			Assert.assertTrue(flag, "print loyalty card error");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	 @Test(priority=9)
	public void verifyOpVisitTest() {
		try {
			patientRegistration.verifyOpVisit();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	
}
