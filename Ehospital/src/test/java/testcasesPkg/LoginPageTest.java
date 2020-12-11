package testcasesPkg;

import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PagesPkg.LoginClass;

public class LoginPageTest extends BaseClass {
LoginClass loginclass;
public LoginPageTest() {
	super();
}

@BeforeMethod
public void setup() {
	initialization();
	loginclass= new LoginClass();
}
	
	@Test
	public void loginTest() throws InterruptedException {
		loginclass.login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(driver.getCurrentUrl(), "https://kipc1099.ehospitalsystems.com/Dashboard.aspx");
	}
		
	
	@Test
	public void loginPageTitleTest() {
		String actualTitle = loginclass.loginPageTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle,"eHospital Systems" , "incorrect title");
	}
	
	@Test
	public void eHospitalLogoTest() {
		Boolean flag = loginclass.eHospitalLogo();
		Assert.assertTrue(flag);
	}
	
@AfterMethod
public void teardown() {
	driver.quit();
}
}
