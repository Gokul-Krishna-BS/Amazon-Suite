package amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_HomePage 
{
	WebDriver driver;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchfield;
	
	@FindBy(id="nav-link-accountList")
	WebElement Accounts_Lists_Link;
	
	@FindBy(linkText = "Your Wish List")
	WebElement Your_Wish_List_Link;
	
	public void Accounts_Lists_Link_(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(Accounts_Lists_Link).perform();
	}
	
	public void Your_Wish_List_Link_()
	{
		Your_Wish_List_Link.click();
	}
	public void searchfield_()
	{
		searchfield.sendKeys("Laptops");
		searchfield.sendKeys(Keys.ENTER);
	}
	
	public Amz_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
