package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Baseclass.BaseClass;
import Webpages.Registerpage;

public class Registervalidation extends BaseClass{

	
	@Test
	public void Registerpagevalidation() {
		
	Registerpage page=	PageFactory.initElements(driver, Registerpage.class);
	
	page.action();
	page.Enter("harry", "pate", "hardik89@gmail.com");
    page.number("+13471236789");
	page.nameofcompany("hardik.inc");
	page.address("789 95th Street jackson hts");
	page.Enter("jackson", "Newyork");
	page.Enter("11378");
	page.country("United States");
	page.Hearfrom("Google");
	page.mobilenumber("4561237890");
	page.password("12345", "12345");
	page.selectNo();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	page.entercaptcha("Z5QC4");
	page.submitform();
	
	}
	
	
}
