package Webpages;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Baseclass.BaseClass;

public class loginpage {
	WebDriver driver;
	
	public loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	
	@FindBy(xpath="//input[@name='username']") WebElement Email;
	@FindBy(xpath="//input[@name='password']") WebElement Password;
	@FindBy(xpath="//input[@id='login']") WebElement Logining;
	@FindBy(xpath="//*[contains(text(),'Login Details Incorrect')]") WebElement error;
	@FindBy(xpath="//*[text()='Forgot Password?']") WebElement Forgotpsw;
	@FindBy(name="email") WebElement email;
	@FindBy(xpath="//*[text()='Submit']") WebElement submit;
	@FindBy(xpath="//*[contains(text(),'No client account was found with')]") WebElement accounterror;
	
	public void Enter(String EnterEmail,String EnterPsw) {
		
		Email.sendKeys(EnterEmail);
		Password.sendKeys(EnterPsw);
	}
	
	public void Login() {
		
		Logining.click();
	}
	
	public void verifyerror() {
	String error1=error.getText();
	System.out.println(error1);
		
	}
	
	public void forgotpassword() {
		Forgotpsw.click();
	}
		
	public void currentURL() {
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		Assert.assertEquals(URL, "https://phptravels.org/pwreset.php");
	}
	
	public void enteremail(String enterforgotemail) {
		email.sendKeys(enterforgotemail);
	}
	
	public void submitbutton() {
		submit.click();
	}
	
	public void noclienterror() {
		String error=accounterror.getText();
		System.out.println(error);
	}
	
	
	 

}
