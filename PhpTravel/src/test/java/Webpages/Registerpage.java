package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class Registerpage  {
	WebDriver driver;
	
	
	public Registerpage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	
	@FindBy(linkText="Register") WebElement Register;
	@FindBy(xpath="//input[@name='firstname']") WebElement firstname;
	@FindBy(xpath="//input[@name='lastname']") WebElement lastname;
	@FindBy(id="inputEmail") WebElement email;
	@FindBy(name="phonenumber") WebElement mobilenumber;
	@FindBy(xpath="//input[@id='inputCompanyName']") WebElement companyname;
	@FindBy(name="address1") WebElement Address;
	@FindBy(xpath="//input[@placeholder='City']") WebElement city;
	@FindBy(id="stateinput") WebElement state;
	@FindBy(xpath="//input[@placeholder='Postcode']") WebElement postcode;
	@FindBy(xpath="//*[@name='country']") WebElement Country;
	@FindBy(xpath="//*[@id='customfield1']") WebElement findus;
	@FindBy(name="customfield[2]") WebElement phonenumber;
	@FindBy(xpath="//input[@name='password']") WebElement psw;
	@FindBy(xpath="//input[@name='password2']") WebElement confirmpsw;
	@FindBy(xpath="//*[contains(@class,'bootstrap-switch-handle-off bootstrap-switch-default')]") WebElement select;
	@FindBy(xpath="//input[@id='inputCaptcha']") WebElement captcha;
	@FindBy(xpath="//*[@type='submit']") WebElement Submit;
	
	
	

	



public void action() {
	Register.click();
	
}

public void Enter(String Enterfirstname,String EnterLastname,String Enteremail) {
	firstname.sendKeys(Enterfirstname);
	lastname.sendKeys(EnterLastname);
	email.sendKeys(Enteremail);
}



public void number(String Entermobilenumber) {
	mobilenumber.sendKeys(Entermobilenumber);
}

public void nameofcompany(String Entercompanyname) {
	companyname.sendKeys(Entercompanyname);
}

public void address(String EnterAddress) {
	Address.sendKeys(EnterAddress);
	
}
public void Enter(String Entercity,String EnterState) {
	city.sendKeys(Entercity);
	state.sendKeys(EnterState);
	
	
}
public void Enter(String Entercitycode)
{
	postcode.sendKeys(Entercitycode);
}

public void country(String Entercountryname) {
	
	Select country=new Select(Country);
	country.selectByVisibleText(Entercountryname);
}

public void Hearfrom(String Enterhearfrom) {
	Select country=new Select(findus);
	country.selectByVisibleText(Enterhearfrom);
}

public void mobilenumber(String EnterMobilenumber) {
	phonenumber.sendKeys(EnterMobilenumber);
}

public void password(String Enterpsw,String Enterconfipsw) {
	psw.sendKeys(Enterpsw);
	confirmpsw.sendKeys(Enterconfipsw);
}

public void selectNo() {
	select.click();
}

public void entercaptcha(String Entercaptcha) {
	captcha.sendKeys(Entercaptcha);
}
public void submitform() {
	Submit.click();
}
}