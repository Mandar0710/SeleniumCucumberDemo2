package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	public WebDriver ldriver;
	 public LoginPage(WebDriver rdriver)
	 {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 @FindBy(xpath = "//span[normalize-space()='My Account']")WebElement lnkmyaccount;
	 @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")WebElement clkloginlnk;
	 @FindBy(xpath = "//input[@id='input-email']")WebElement username;
	 @FindBy(xpath="//input[@id='input-password']") WebElement password;
	 @FindBy(xpath="//input[@value='Login']") WebElement loginbutton;
	 @FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement logout;
		
		public void myaccountlink()
		{
			lnkmyaccount.click();
		}
		public void loginlink()
		{
			clkloginlnk.click();
		}
		public void username(String uname)
		{
			username.sendKeys(uname);
		}
		public void paswword(String pwd)
		{
			password.sendKeys(pwd);
		}
		public void loginbutton()
		{
			loginbutton.click();
		}
		public void logout()
		{
			logout.click();
		}		
}