package Selenium.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//DesignPattern.
public class PageFactoryClass {
	WebDriver driver;
	 
	public PageFactoryClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "signInBtn")
	WebElement submitBtn;
	
	public void enterUsername(String user)
	{
		username.sendKeys(user);
	}
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickSignIN()
	{
		submitBtn.click();
	}
}
