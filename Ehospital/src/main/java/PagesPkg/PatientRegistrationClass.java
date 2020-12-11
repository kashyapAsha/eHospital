package PagesPkg;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePkg.BaseClass;

public class PatientRegistrationClass extends BaseClass {
     WebDriverWait wt;
     JavascriptExecutor js;
     Actions action;
     
	//page factory for patient reg page
	@FindBy(xpath="//small[contains(text(),'Patient Registration')]")
	WebElement patRegLink;
	//name
	@FindBy(xpath="//input[@id = 'MainContent__PatientRegistration1_txtPatientName']")
	WebElement name; 
	//middle name
	@FindBy(xpath="//input[@id = 'MainContent__PatientRegistration1_txtMiddleName']")
	WebElement middleName;
	//last name
	@FindBy(xpath="//input[@id = 'MainContent__PatientRegistration1_txtLastName']")
	WebElement lastName;
	//dob
	@FindBy(xpath="//input[@id = 'MainContent__PatientRegistration1_txtAge']")
	WebElement dob;
	
	@FindBy(id="MainContent__PatientRegistration1_txtMonth")
	WebElement dobm;
	//gender
	@FindBy(xpath="//select[@id = 'MainContent__PatientRegistration1_cmbGender']")
	WebElement genderList;
	//marital status
	@FindBy(xpath="//select[@id = 'MainContent__PatientRegistration1_cmbMaritalStatus']")
	WebElement maritalStatusList;
	//ocupation
	@FindBy(xpath="//select[@id = 'MainContent__PatientRegistration1_cmbOccupation']")
	WebElement occupationList;
	//language
	@FindBy(xpath="//select[@id = 'MainContent__PatientRegistration1_ddlPreferredLanguage']")
	WebElement languageList;
	//religion
	@FindBy(xpath="//select[@id = 'MainContent__PatientRegistration1_ddlReligion']")
	WebElement religionList;
	//nationality
	@FindBy(xpath="//input[@class = 'rcbInput radPreventDecorate']")
	WebElement nationalityBox;
	@FindBys(@FindBy(xpath=".//*[@class = 'rcbList']//li"))
	List<WebElement> nationalityList;
	//Email
	@FindBy(xpath="//input[@id ='MainContent__PatientRegistration1_txtEmail']")
	WebElement email;
	//loyalty card
	@FindBy(xpath="//select[@id = 'MainContent__PatientRegistration1_ddlLoyalty']")
	WebElement loyaltyCardList;
	//loylty card no
	@FindBy(xpath="//input[@id = 'MainContent__PatientRegistration1_txtLoyaltyCardNo']")
	WebElement cardNo;
	//identity
	@FindBy(xpath="//select[@id = 'MainContent__PatientRegistration1_ddlIdentity']")
	WebElement identityList;
	//identity no.
	@FindBy(xpath="//input[@id = 'MainContent__PatientRegistration1_txtIdentityNo']")
	WebElement identityCardNo;
	//address
	@FindBy(xpath="//input[@id = 'MainContent__PatientRegistration1_txtAddress1']")
	WebElement address;
	//province
	@FindBy(xpath="//select[@id = 'MainContent__PatientRegistration1_ddlCountry']")
	WebElement provinceList;
	//District
	@FindBy(id="MainContent__PatientRegistration1_ddlState")
	WebElement districtList;
	//commune box
	@FindBy(id="MainContent__PatientRegistration1_txtcityname")
	WebElement communeBox;
	//commune list
	@FindBys(@FindBy(xpath=".//*[@id = 'ui-id-1']//li"))
	List<WebElement> communeList;
	//pin
	@FindBy(xpath="//input[@id = 'MainContent__PatientRegistration1_txtPinNo']")
	WebElement pincode;
	//ph no
	@FindBy(xpath="//input[@id = 'MainContent__PatientRegistration1_txtMobile']")
	WebElement telephone;
	//ph no2
	@FindBy(xpath="//input[@id = 'MainContent__PatientRegistration1_txtOtherMobile']")
	WebElement telephone2;
	//postal addrss
	@FindBy(xpath="//input[@id = 'MainContent__PatientRegistration1_chkHouseAddress']")
	WebElement checkBoxPostal;
	//postal addrss
	@FindBy(xpath="//input[@id = 'MainContent__PatientRegistration1_txtHAaddress']")
	WebElement postalAddress;
	//postal province
	@FindBy(xpath="//select[@id = 'MainContent__PatientRegistration1_ddlHACountry']")
	WebElement postalProvinceList;
	//postal district
	@FindBy(xpath="//select[@id = 'MainContent__PatientRegistration1_ddlHAState']")
	WebElement postalDistrictList;
	//postal commune
	@FindBy(id="MainContent__PatientRegistration1_txtHACity")
	WebElement postalCommuneBox;
	@FindBys(@FindBy(xpath="//ul[@class = 'ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all']//li"))
	List<WebElement> postalCommuneList;
	//nearest relative
	@FindBy(xpath="//input[@id = 'MainContent__PatientRegistration1_chkAddress']")
	WebElement nearestRelative;
	//relative name
	@FindBy(xpath="//input[@id= 'MainContent__PatientRegistration1_txtContactPersonName']")
	WebElement relativeName;
	//relation list
	@FindBy(xpath="//select[@id = 'MainContent__PatientRegistration1_ddlRelationEmg']")
	WebElement relationList;
	//save button
	@FindBy(id="MainContent__PatientRegistration1_Button5")
	WebElement saveButton;
	//contiue button
	@FindBy(css="#MainContent__PatientRegistration1_imgbtncontinue")
	WebElement continueButton;
	@FindBy(css="#MainContent__PatientRegistration1_lblMsgN")
	WebElement alertMsg;
	@FindBy(css="#CloseReg1")
	WebElement ok;
	@FindBy(id="MainContent__PatientRegistration1_txtPatRegistrationId")
	WebElement uhid;
	//three dots
	@FindBy(xpath="//input[@id='MainContent__PatientRegistration1_ImageButton6']")
	WebElement actionButton;
	//print patient info
	@FindBy(xpath="//body[1]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]/span[1]/div[2]/ul[1]/li[1]/ul[1]/table[1]/tbody[1]/tr[3]/td[1]/li[1]/a[1]")
	WebElement printPatientInfo;
	@FindBy(xpath="//span[@id='MainContent__PatientRegistration1_Label17']")
	WebElement print1;
	//search button
	@FindBy(xpath="//input[@id='MainContent__PatientRegistration1_ImageButton5']")
	WebElement searchButton;
	//search UHID
	@FindBy(xpath="//input[@id='MainContent__PatientRegistration1__testSearch_txtserRegNo']")
	WebElement searchUhid;
	//hand icon
	@FindBy(xpath="//input[@id='MainContent__PatientRegistration1__testSearch_ImageButton1']")
	WebElement searchHandIcon;
	//fetchedUhid
	@FindBy(xpath="//span[@id='MainContent__PatientRegistration1__testSearch_dgPatSearch_lblRegistrationNo_0']")
	WebElement fetchUhid;
	//click on fetch hand icon
	@FindBy(xpath="//input[@id='MainContent__PatientRegistration1__testSearch_dgPatSearch_imgbutton_0']")
	WebElement fetchHandIcon;
	//uhid date
	@FindBy(xpath="//input[@id='MainContent__PatientRegistration1_txtRegDate']")
	WebElement uhidDate;
	//uhid text box
	@FindBy(xpath="//input[@id='MainContent__PatientRegistration1_txtPatRegistrationId']")
	WebElement uhidTextBox;
	//uhid hand icon
	@FindBy(xpath="//input[@id='MainContent__PatientRegistration1_ImageButton3']")
	WebElement uhidHandIcon;
	//registration card
	@FindBy(xpath="//body[1]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]/span[1]/div[2]/ul[1]/li[1]/ul[1]/table[1]/tbody[1]/tr[4]/td[1]/li[1]/a[1]")
	WebElement printRegistrationCard;
	//company document
	@FindBy(xpath="//body[1]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]/span[1]/div[2]/ul[1]/li[1]/ul[1]/table[1]/tbody[1]/tr[5]/td[1]/li[1]/a[1]")
	WebElement companyDoc;
	@FindBy(xpath="//body[1]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]/span[1]/div[2]/ul[1]/li[1]/ul[1]/table[1]/tbody[1]/tr[6]/td[1]/li[1]/a[1]")
	WebElement printLoyaltyCard;
	//op visit
	@FindBy(xpath="//body[1]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]/span[1]/div[2]/ul[1]/li[1]/ul[1]/table[1]/tbody[1]/tr[2]/td[1]/li[1]/a[1]")
	WebElement opVisit;
	
	
	public PatientRegistrationClass() {
		wt= new WebDriverWait(driver,50);
	    js = (JavascriptExecutor)driver;
	    action = new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void registrationOfPatient(String fname, String mname,String lname, String age,String mail, String loyaltyCardNo, String identityNo, String addrss, String pin, String phone1, String phone2, String postalAdress, String relative) throws InterruptedException {
		wt.until(ExpectedConditions.visibilityOf(patRegLink)).click();
		//enter name
		name.sendKeys(fname);
		Thread.sleep(5000);
		//enter middle name
		middleName.sendKeys(mname);
		Thread.sleep(2000);
		//enter last name
		lastName.sendKeys(lname);
		Thread.sleep(2000);
		//fill DOB
		dob.sendKeys(age);
		Thread.sleep(3000);
		dobm.click();
		Thread.sleep(11000);
		//select gender
		Select genderfemale = new Select(genderList);
		genderfemale.selectByVisibleText("Female");
		Thread.sleep(11000);
		try {
		//marital status
		Select MaritalStatus = new Select(maritalStatusList);
		MaritalStatus.selectByVisibleText("Single");
		Thread.sleep(5000);
		//occupation
		Select Occupation = new Select(occupationList);
		Occupation.selectByVisibleText("Farmer/Fisherman");
		Thread.sleep(5000);
		//select language
		Select Language = new Select(languageList);
		Language.selectByVisibleText("English");
		Thread.sleep(3000);
		//select religion
		Select religion = new Select(religionList);
		religion.selectByVisibleText("Hinduism");
		Thread.sleep(5000);
		//click on nationality box
		nationalityBox.click();
		Thread.sleep(3000);
		//select nationality
		for (WebElement nationality : nationalityList) {
			if(nationality.getText().trim().equals("American")) {
				nationality.click();
				break;
			}
		}
		Thread.sleep(4000);
		//enter email
		email.sendKeys("As@gmail.com");
		Thread.sleep(3000);
		//select loyalty card
		Select loyal = new Select(loyaltyCardList);
		loyal.selectByVisibleText("Green Card");
		Thread.sleep(11000);
		//fill card no.
		WebElement card = wt.until(ExpectedConditions.elementToBeClickable(cardNo));
		card.sendKeys(loyaltyCardNo);
		Thread.sleep(4000);
		//select identity card
		Select identity = new Select(identityList);
		identity.selectByVisibleText("Driving License");
		Thread.sleep(12000);
		identityCardNo.sendKeys(identityNo);
		Thread.sleep(4000);
		
		}catch(Exception e) {
			System.out.println("exception");
		}
		//fill address
		address.sendKeys(addrss);
		Thread.sleep(4000);
		//select province
		Select province = new Select(provinceList);
		province.selectByVisibleText("Kampot");
		Thread.sleep(12000);
		//select district
		Select district = new Select(districtList);
		district.selectByVisibleText("CHUMKIRI");
		Thread.sleep(5000);
		//select commune
		communeBox.sendKeys("%");
		Thread.sleep(2000);
		for (WebElement webElement : communeList) {
			if(webElement.getText().trim().equals("Snay Anhchet")) {
				webElement.click();
				break;
			}
		}
		Thread.sleep(3000);
		//enter pin
		pincode.sendKeys(pin);
		Thread.sleep(2000);
		//enter no.
		telephone.sendKeys(phone1);
		Thread.sleep(2000);
		telephone2.sendKeys(phone2);
		Thread.sleep(2000);
		try
		{
			checkBoxPostal.click();
			Thread.sleep(14000);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)" );
			Thread.sleep(8000);
			//enter postal address
			postalAddress.sendKeys(postalAdress);
			Thread.sleep(3000);
			//select postal province
			Select postal = new Select(postalProvinceList);
			postal.selectByVisibleText("Kep");
			Thread.sleep(12000);
			//select district
			Select District = new Select(postalDistrictList);
			District.selectByVisibleText("KEP");
			Thread.sleep(6000);
			//select postal commune
			postalCommuneBox.sendKeys("%");
			Thread.sleep(2000);
			for (WebElement webEle :  postalCommuneList) {
				if(webEle.getText().trim().equals("Kep")) {
					webEle.click();
					break;
				}
				
			}
			//select relative
			Thread.sleep(8000);
			nearestRelative.click();
			//select relative name
			Thread.sleep(11000);
			relativeName.sendKeys(relative);
			Thread.sleep(5000);
			//select relation
			Select nearestRelation = new Select(relationList);
			nearestRelation.selectByVisibleText("BROTHER-IN-LAW");
			Thread.sleep(7000);
			
			js.executeScript("window.scrollBy(0,-400)", "");
			Thread.sleep(4000);
		
		}catch(Exception e) {
			
		}
		
		saveButton.click();
		Thread.sleep(4000);
		WebElement continueClickable = wt.until(ExpectedConditions.elementToBeClickable(continueButton));
		if(continueClickable.isDisplayed()==true) {
			continueButton.click();
			}
			Thread.sleep(4000);
			
			WebElement message =wt.until(ExpectedConditions.visibilityOf(alertMsg));
			String msg=message.getText();
			System.out.println(msg);
			Thread.sleep(3000);
			WebElement okButton = wt.until(ExpectedConditions.elementToBeClickable(ok));
			okButton.click();
			Thread.sleep(2000);
		
	}
	
	public String getPatientUHID() {
		return uhid.getAttribute("value");
	}
	
	public void verifyPatientSearch(String uhid) throws InterruptedException {
		wt.until(ExpectedConditions.visibilityOf(patRegLink)).click();
		Thread.sleep(6000);
		wt.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
		Thread.sleep(4000);
		wt.until(ExpectedConditions.visibilityOf(searchUhid)).sendKeys(uhid);
		Thread.sleep(4000);
		searchHandIcon.click();
		Thread.sleep(3000);
		//Boolean uhidFlag= wt.until(ExpectedConditions.visibilityOf(fetchUhid)).isDisplayed();
	//	System.out.println(uhidFlag);
		//if(uhidFlag==true) {
		wt.until(ExpectedConditions.elementToBeClickable(fetchHandIcon)).click();
		//}else {
			//System.out.println("Error= patient is not searched");
		//}
		Thread.sleep(6000);
		String isUhidDisplayed= uhidDate.getAttribute("value");
		System.out.println(isUhidDisplayed);
		
	}
	
	public String getPatientByHandIcon(String uhid) throws InterruptedException {
		wt.until(ExpectedConditions.visibilityOf(patRegLink)).click();
		Thread.sleep(6000);
		uhidTextBox.sendKeys(uhid);
		Thread.sleep(4000);
		uhidHandIcon.click();
		Thread.sleep(8000);
		WebElement FirstName= wt.until(ExpectedConditions.visibilityOf(name));
		return FirstName.getAttribute("value");
		
	}
	
	public Boolean verifyPrintPatientInfo() throws InterruptedException {
		actionButton.click();
		Thread.sleep(5000);
		action.moveToElement(printPatientInfo).build().perform();
		Thread.sleep(3000);
		printPatientInfo.click();
		Thread.sleep(7000);
		return print1.isDisplayed();
		//System.out.println(flag);
		
	}
	
	public Boolean verifyPrintRegistrationCard() throws InterruptedException {
		actionButton.click();
		Thread.sleep(5000);
		action.moveToElement(printRegistrationCard).build().perform();
		Thread.sleep(3000);
		printRegistrationCard.click();
		Thread.sleep(7000);
		return print1.isDisplayed();
	}
	
	public Boolean verifyCompanyDocument() throws InterruptedException {
		actionButton.click();
		Thread.sleep(5000);
		action.moveToElement(companyDoc).build().perform();
		Thread.sleep(3000);
	    companyDoc.click();
		Thread.sleep(7000);
		return print1.isDisplayed();
	}
	
	public Boolean verifyPrintLoyaltyCard() throws InterruptedException {
		actionButton.click();
		Thread.sleep(5000);
		action.moveToElement(printLoyaltyCard).build().perform();
		Thread.sleep(3000);
	    printLoyaltyCard.click();
		Thread.sleep(7000);
		return print1.isDisplayed();
	}
	
	
	public void verifyOpVisit() throws InterruptedException {
		actionButton.click();
		Thread.sleep(5000);
		action.moveToElement(opVisit).build().perform();
		Thread.sleep(3000);
	    opVisit.click();
		Thread.sleep(7000);
		driver.switchTo().frame("MainContent__PatientRegistration1_frmVisit");
		WebElement op= driver.findElement(By.xpath("//select[@id='MainContent_ddlDoctorTeam']"));
		op.click();
		Thread.sleep(2000);
		Select sel= new Select(op);
		sel.selectByValue("1");
		Thread.sleep(3000);
		WebElement speciality = driver.findElement(By.xpath("//select[@id='MainContent_ddlSpecialty']"));
		speciality.click();
		Thread.sleep(2000);
		Select sel1= new Select(speciality);
		sel1.selectByValue("8");
		Thread.sleep(2000);
		WebElement save= driver.findElement(By.xpath("//input[@id='MainContent_btnSave']"));
		save.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
