package BasePkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
public static WebDriver driver;
public static Properties prop;

public BaseClass() {
	prop = new Properties();
	try {
		//FileInputStream ip = new FileInputStream("/Users/admin/eclipse-workspace/Ehospital/src/main/java/ConfigPkg/Config.properties");
		FileInputStream ip= new FileInputStream("C:\\Users\\admin\\git\\eHospital\\Ehospital\\src\\main\\java\\ConfigPkg\\Config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
public static void initialization() {
	String browserName= prop.getProperty("browser");
	if(browserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Documents\\browser drvr\\geckodriver.exe");
	     driver = new FirefoxDriver();
	}
	else if (browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\browser drvr\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
}

}
