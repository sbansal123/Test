package t1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;
public class mobproxy {


		
		String driverPath = ".\\exefiles\\chromedriver.exe";
		String sFileName = "d:/SeleniumEasy.har";
		
		public WebDriver driver;
		public BrowserMobProxy proxy;
		
		@BeforeTest
		public void setUp() {
			
		   // start the proxy
		    proxy = new BrowserMobProxyServer();
		    proxy.start(0);

		    //get the Selenium proxy object - org.openqa.selenium.Proxy;
		    Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);

		    // configure it as a desired capability
		    DesiredCapabilities capabilities = new DesiredCapabilities();
		    capabilities.setCapability(CapabilityType.PROXY, seleniumProxy);
			
		    //set chromedriver system property
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver(capabilities);
			
		    // enable more detailed HAR capture, if desired (see CaptureType for the complete list)
		    proxy.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);

		    // create a new HAR with the label "seleniumeasy.com"
		    proxy.newHar("seleniumeasy.com");

		    // open seleniumeasy.com
		    driver.get("https://excellence.ishir.com/");
	        
		}
		
		@Test
		public void testCaseOne() {
			System.out.println("Navigate to selenium tutorials page");
			driver.findElement(By.xpath("//input[@placeholder='E-mail']")).sendKeys("sbansal@ishir.com");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("onemanarmy@1992");
			driver.findElement(By.xpath("//input[@class='btn btn-lg btn-primary btn-block']")).click();
	//		driver.findElement(By.linkText("Selenium"));
	//		driver.findElement(By.xpath("//li[@class='leaf']//a[contains(text(),'TestNG')]")).click();
		}
		
		@AfterTest
		public void tearDown() {

			// get the HAR data
			Har har = proxy.getHar();

			// Write HAR Data in a File
			File harFile = new File(sFileName);
			try {
				har.writeTo(harFile);
			} catch (IOException ex) {
				 System.out.println (ex.toString());
			     System.out.println("Could not find file " + sFileName);
			}
			
			if (driver != null) {
				proxy.stop();
				driver.quit();
			}
		}
	}


