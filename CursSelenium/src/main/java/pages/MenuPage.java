package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {
	//toate ob din aceasta clasa vor fi folosite in clasa de test
	
	public WebDriver driver;
	
	public MenuPage(WebDriver driver){
		this.driver = driver;
	
	}
	
	public By loginLink = By.cssSelector("li>a[href='#popup_login']");//locator care cauta element dupa selectori CSS
	public By contactsLink =  By.linkText("CONTACTS");// e tot un locator care foloseste metoda de cautare a textului de pe site ul meu
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}

}
