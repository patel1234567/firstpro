package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.ups.com/ca/en/Home.page");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.linkText("Log In")).click();
		 driver.findElement(By.name("userID")).sendKeys("hardik8919");
		 driver.findElement(By.id("pwd")).sendKeys("PAtel3456");
		 driver.findElement(By.id("submitBtn")).click();
	}

}
