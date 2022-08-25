package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.basetest;

public class loginPage extends basetest {
	//All the locators of page
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement passWord;
	
	@FindBy(xpath="//*[text()=' Login ']")
	WebElement login;
	
	@FindBy(xpath="//h5[text()='Login']")
	WebElement txtloginpage;
	
	
	//Intialitions of locators/variables
	public loginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	// methods required to perform test steps
	public void loginMethod() {
		userName.sendKeys("Admin");
		passWord.sendKeys("admin123");
		login.click();
	}
	public String titleLoginPage() {
		return txtloginpage.getText();
	}
	
//	public String CuurentUrl() {
		
//				return driver.getCurrentUrl();
//	}

}
