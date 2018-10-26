package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	protected WebDriver driver;
	@BeforeClass
	public void startbrower() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://phptravels.org/clientarea.php");
		
		driver.manage().window().maximize();
		
		
	}
	
	@AfterClass
	public void closebrower() {
		
		driver.close();
		
	}

}
