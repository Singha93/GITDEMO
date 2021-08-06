package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Homepage {
	public static WebDriver driver;
	
	By search = By.xpath("//input[@class='search-keyword']");
	
	public Homepage(WebDriver driver) {
		
		this.driver= driver;
	}
	
	public WebElement getSearch() {
		
		return driver.findElement(search);
	}

}
