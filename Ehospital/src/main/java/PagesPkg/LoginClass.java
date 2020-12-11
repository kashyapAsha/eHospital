package PagesPkg;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

import BasePkg.BaseClass;

public class LoginClass extends BaseClass {
	//Page factory of login page
	public Boolean admin= null;
	
	@FindBy(id= "username")
	WebElement username;
	
	@FindBy(id= "password")
	WebElement password;
	
	@FindBy(id= "ddlHospital")
	WebElement hospital;
	
	@FindBy(xpath= "//body/form[@id='login']/div[@id='up1']/section[1]/div[1]/div[1]/div[1]/div[2]/img[1]")
	WebElement logo;
	
	@FindBy(id= "btnValidateLogin")
	WebElement loginbutton;
	
	
	//initializing page objects with driver
	public LoginClass() {
		PageFactory.initElements(driver, this);
	}
	
	public String loginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean eHospitalLogo() {
		return logo.isDisplayed();
	}
	
	public void login(String uname, String pwd) throws InterruptedException {
		username.sendKeys(uname);
		Thread.sleep(3000);
		password.sendKeys(pwd);
		Thread.sleep(3000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", hospital);
		Thread.sleep(2000);
		Select select1 =new Select(hospital);
		select1.selectByValue("1");
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		loginbutton.click();
		Thread.sleep(2000);
		
		
		
		
	}
	
	

}
