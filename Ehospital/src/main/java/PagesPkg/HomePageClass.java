package PagesPkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BasePkg.BaseClass;

public class HomePageClass extends BaseClass {
	//Actions act;

	@FindBy(xpath="//span[@id='lblUser']")
    WebElement loginUserName;
	
	@FindBy(xpath= "//body/form[@id='login']/div[@id='up1']/section[1]/div[1]/div[1]/div[1]/div[2]/img[1]")
	WebElement logo;
	
	@FindBys(@FindBy(tagName="img"))
	List<WebElement> link;
	
	
	
	public  HomePageClass () {
		//act = new Actions(driver);
		PageFactory.initElements(driver, this);
	}
		
		public String homePageTitle() {
			return driver.getTitle();
	}
		
		public boolean eHospitalLogo() {
			return logo.isDisplayed();
		}
		
		public boolean loginUser() {
			return loginUserName.isDisplayed();
		}
		
		
		
		public void validateImgLink() {
		System.out.println("Total links are:"+ link.size());
		for(int i=0; i<link.size(); i++) {
			WebElement ele= link.get(i);
			String imgurl = ele.getAttribute("src");
			
			
				try {
					URL url = new URL(imgurl);
					HttpURLConnection httpurl = (HttpURLConnection)url.openConnection();
					httpurl.setConnectTimeout(4000);
					httpurl.connect();
					if(httpurl.getResponseCode()==200) {
						System.out.println(imgurl+" "+httpurl.getResponseMessage());
					}
					else if(httpurl.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
						System.out.println(imgurl+" "+httpurl.getResponseMessage()+" "+HttpURLConnection.HTTP_NOT_FOUND);
					}
				}catch(Exception e) {
					
				}
			
		
}
		
		
}
		
		
		
		
}
			

