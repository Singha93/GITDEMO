package Automation;

import java.io.IOException;

import org.testng.annotations.Test;

public class Homepage extends base

{
@Test
public void basepageNavigation() throws IOException
{
	driver= initializeDriver();
	driver.get("http://www.qaclickacademy.com/");
}

}
