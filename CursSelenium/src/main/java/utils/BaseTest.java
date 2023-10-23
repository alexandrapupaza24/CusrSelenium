package utils;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();//maximises the screen
		driver.get("https://keybooks.ro");
		
	}
	
	
	@AfterClass
	public void tearDown() throws InterruptedException  {
		Thread.sleep(4000);//bad practice
		//driver.close(); // inchide tabul curent
		driver.quit();// inchide browserul indiferent cate taburi sunt deschide
	}

}
