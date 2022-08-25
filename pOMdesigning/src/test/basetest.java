package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import mainjava.Pimpage;
import mainjava.loginPage;



public class basetest {
	public static WebDriver driver;
	protected loginPage Loginpage;
	protected Pimpage pimpage;

	@BeforeClass
	public void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@BeforeClass
	public void pageObjects() {
		Loginpage=new loginPage(driver);
		pimpage  =new Pimpage(driver);
	}
	
//	/@AfterClass
//	public void tearDownEnvirnment() {
//		driver.quit();
	}


