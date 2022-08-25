package test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mainjava.loginPage;

public class LoginTest extends basetest  {
	@Test(priority=0)
	public void verifylogin() {
	
		Loginpage.loginMethod();}
		
		@Test(priority=1)
		public void verifyDisplyedOfLogin() {
			Assert.assertEquals(Loginpage.titleLoginPage(),"Login");
		}
	
	
    @Test(priority=2)
    public void verifyPimPage() {
        Assert.assertEquals(pimpage.titleofpimpage(),"PIM");

    }
//    @Test(priority=-1)
//    public void verifyUrlofPage() {
//    	Assert.assertEquals(Loginpage.CurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//    }
}
