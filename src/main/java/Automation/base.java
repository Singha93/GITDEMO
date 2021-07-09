package Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop= new Properties();
		
		FileInputStream fis = new FileInputStream ("C:\\Users\\anirb\\eclipse-workspace\\E2E\\src\\main\\java\\Automation\\data.properties");
		
		prop.load(fis);
		
		String BrowserName=prop.getProperty("browser");
		
		if (BrowserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\D:\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		if (BrowserName == "firefox") 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\D:\\chromedriver.exe");
		}
		if (BrowserName == "IE")
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\D:\\chromedriver.exe");
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		
		}
}



