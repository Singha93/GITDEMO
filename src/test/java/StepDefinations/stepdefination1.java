package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Homepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import resources.Base;

public class stepdefination1 {

	Homepage h;
	public WebDriver driver;
	@Given("^User is on Greencart Landing page$")
	public void user_is_on_Greencart_Landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver=Base.initDriver();
	     
	}

	@When("^User searched for (.+) Vegetable$")
	public void user_searched_for_Vegetable(String Username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 h = new Homepage(driver);
		 h.getSearch().sendKeys(Username);
		
		Thread.sleep(3000);
	   
	}

	@Then("^(.+) results are displayed$")
	public void results_are_displayed(String Username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Assert.assertTrue( driver.findElement(By.cssSelector("h4.product-name")).getText().contains(Username));
	    
	}
	@Then("^verify selected (.+) items are displayed in the checkout page$")
    public void verify_selected_something_items_are_displayed_in_the_checkout_page(String Username) throws Throwable {
		Assert.assertTrue( driver.findElement(By.cssSelector("p.product-name")).getText().contains(Username));
    }

	    @And("^Added items to cart$")
	    public void added_items_to_cart() throws Throwable {
	    	driver.findElement(By.cssSelector("a.increment")).click();
	    	driver.findElement(By.cssSelector("div#root div.product-action > button[type=\"button\"]")).click();
	    	
	    }

	    @And("^User proceed to checkout page for purchase$")
	    public void user_proceed_to_checkout_page_for_purchase() throws Throwable {
	        driver.findElement(By.cssSelector("div#root a.cart-icon > img")).click();
	        driver.findElement(By.cssSelector("div#root div.cart-preview.active > div.action-block > button[type=\"button\"]")).click();
	        
	    }
	    

	}





