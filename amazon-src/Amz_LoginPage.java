package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_LoginPage
{
	WebDriver driver;
	@FindBy(id="ap_email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement SignIn_button;
	
	public void username_()
	{
		username.sendKeys("krishnasaseendran29@gmail.com");
	}
	public void continue_button_()
	{
		continue_button.click();
	}
	public void password_()
	{
																																																										password.sendKeys("sobhasaseendran");
	}
	public void SignIn_button_()
	{
		SignIn_button.click();
	}
	public Amz_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}









