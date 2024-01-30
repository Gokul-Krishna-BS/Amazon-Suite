package amazon;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_ShoppingCartPage
{	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement Proceed_to_buy_button;
	
	@FindBy(xpath = "(//input[@value='Save for later'])[1]")
	WebElement Save_for_later_link;
	
	@FindBy(xpath = "(//input[@value='Add to list'])[1]")
	WebElement Add_to_list_link;
	
	@FindAll(@FindBy(xpath = "(//div[@class='a-popover-content']/div/ul/li)"))
	List<WebElement> WishList_Select;
	
	public void Proceed_to_buy_button_()
	{
		Proceed_to_buy_button.click();
	}
	
	public void Save_for_later_link_()
	{
		Save_for_later_link.click();
	}
	
	public void Add_to_list_link_()
	{
		Add_to_list_link.click();
	}
	
	public void WishList_Select_()
	{
		WishList_Select.get(0);
	}
	
	public Amz_ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
