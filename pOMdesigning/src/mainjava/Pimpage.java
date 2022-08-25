package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pimpage {
	@FindBy(xpath="//h6[text()='PIM']")
	WebElement txtPagepim;
	
	public Pimpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public  String titleofpimpage() {
		return txtPagepim.getText();
	}
	

}
