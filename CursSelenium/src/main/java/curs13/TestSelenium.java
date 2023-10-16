package curs13;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome. ChromeDriver;

public class TestSelenium {
	
 @Test
public void openBrowser() {
	
	 WebDriver driver = new ChromeDriver();
	// WebDriver driver = new FireFoxDriver();
	// WebDriver driver = new EdgeDriver();
	// WebDriver driver = new SfariDriver();
	 
	 driver.manage().window().maximize();
	 driver.get("https://keybooks.ro");
	 driver.findElement(By.linkText("Login")).click(); //driver = instanta de browser
	 //driver.findElement(By.id("log")).isDisplayed(); //driver.quit();
	 //driver.findElement(((WebElement) By.id("log")).sendKeys("TestUser");
	 WebElement username = driver.findElement(By.id("log"));
	 username.isDisplayed();
	 username.sendKeys("TestUser");
	 assertTrue(username.isDisplayed());
	 
	 //driver.quit(};
	
  }
}
