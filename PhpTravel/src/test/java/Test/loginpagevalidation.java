package Test;





import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Baseclass.BaseClass;
import Webpages.loginpage;


public class loginpagevalidation extends BaseClass{
	

	
	@Test
	public void loginvalidation() {
		
	loginpage page=PageFactory.initElements(driver, loginpage.class);
	
	page.Enter("hardik89@gmail.com", "patel820");
	page.Login();
  page.verifyerror();
   page.forgotpassword();
   page.currentURL();
   page.enteremail("naruto@talentech.com");
   page.submitbutton();
   page.noclienterror();
   

	

}
}
