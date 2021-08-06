package StepDefinations;

import java.sql.Driver;

import io.cucumber.java.After;
import resources.Base;



public class Hooks extends Base{

	@After("@SeleniumTests")
	public void AfterSelenium ()
	{
	driver.close();
	}
}
