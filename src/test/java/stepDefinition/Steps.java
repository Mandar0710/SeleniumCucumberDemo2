package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.LoginPage;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class Steps 
{
	 WebDriver driver;
	public LoginPage lp;
	
	@Given("User lanuch Chrome browser")
	public void user_lanuch_chrome_browser() {
	    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	    driver=new ChromeDriver();
	    lp=new LoginPage(driver);
	    driver.manage().window().maximize();
	   
	}

	@When("user opens the URL {string}")
	public void user_opens_the_url(String url)
	{
	   driver.get(url);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("Enter the valid user name {string} and password {string}")
	public void enter_the_valid_user_name_and_password(String username, String password) throws InterruptedException {
		 Thread.sleep(2000);
		lp.myaccountlink();
		lp.loginlink();
		Thread.sleep(2000);
		lp.username(username);
		lp.paswword(password);
		Thread.sleep(2000);

	}

	@Then("Click on login")
	public void click_on_login() throws InterruptedException {
	   lp.loginbutton();
	   Thread.sleep(2000);
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) throws InterruptedException {
	    if(driver.getPageSource().contains("No match for E-Mail Address and/or Password."))
	    {
	    	driver.close();
	    }
	    else
	    {
	    	Assert.assertEquals(string, driver.getTitle());
	    }
	    Thread.sleep(2000);
	}

	@When("User click on Logout")
	public void user_click_on_logout() {
	    lp.logout();
	}

	@Then("Close the browser")
	public void close_the_browser() throws InterruptedException {
	    driver.close();
	    Thread.sleep(2000);
	}
}
