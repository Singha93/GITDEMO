package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Base {
	public static WebDriver driver;
	public static WebDriver initDriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\global.properties");
		
		prop.load(fis);
	 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\main\\java\\executables\\chromedriver.exe");
	 
	 
     
	 driver = new ChromeDriver();
	 driver.get(prop.getProperty("url"));
	 return driver;
}
}
