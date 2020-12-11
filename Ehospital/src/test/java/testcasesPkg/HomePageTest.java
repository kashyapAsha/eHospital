package testcasesPkg;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PagesPkg.HomePageClass;
import PagesPkg.LoginClass;

public class HomePageTest extends BaseClass  {
	LoginClass loginclass;
	HomePageClass homepage;
	
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		loginclass= new LoginClass();
		loginclass.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage= new HomePageClass();
		
	}
	
	@Test
	public void homePageTitleTest() {
		String actualTitle = homepage.homePageTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle,"eHospital Systems" , "incorrect title");	
}
	
	@Test
	public void eHospitalLogoTest() {
		Boolean flag = homepage.eHospitalLogo();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void loginUserNameTest() {
		Boolean flag = homepage.loginUser();
		Assert.assertTrue(flag);
	}
	
	@Test
public void linkTest()  {
		//loginclass.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.validateImgLink();
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
