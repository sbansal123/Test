package t1;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.UtilityMethods;

public class Test1 {
	
private WebDriver driver;
	
	static String executionMode = "linear";
	
	
	@BeforeTest
	@Parameters("browser")

	public void setExtent(String browserName) throws IOException, Throwable {
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", ".\\exefiles\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		
	
		UtilityMethods.modeOfExecution = executionMode;
		driver.manage().deleteAllCookies();
		driver.get("http://192.168.2.151/opencart");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void name() {
		System.out.println("1234");
		driver.get("http://motovation.demo2clients.com");
		
		
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}
	

}
