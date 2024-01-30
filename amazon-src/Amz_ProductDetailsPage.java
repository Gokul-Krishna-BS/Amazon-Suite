package amazon;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_ProductDetailsPage
{
	WebDriver driver;
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement Add_to_cart;
	
	@FindBy(id="buy-now-button")
	WebElement Buy_now_button;
	
	public void Add_to_cart_()
	{
		try
		{
			Add_to_cart.click();
		}
		catch(ElementNotInteractableException e1)
		{
			Buy_now_button.click();
		}
	}
	
	public void Buy_now_button_()
	{
		Buy_now_button.click();
	}
	
	public Amz_ProductDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
