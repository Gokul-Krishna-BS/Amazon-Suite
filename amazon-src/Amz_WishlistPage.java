package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_WishlistPage
{
	WebDriver driver;
	@FindBy(xpath="//input[@id='add-to-wishlist-button']")
	WebElement Add_to_wishlist_button;
	
	@FindBy(xpath="//span[@data-action='show-create-list']")
	WebElement CreateAnotherWishlistLink;
	
	@FindBy(xpath="(//div[@class='a-popover-wrapper'])[3]")
	WebElement Create_A_New_WishList_Popup;
	
	@FindBy(linkText = "Add to Cart")
	WebElement Add_To_Cart_Wishlist_Page;
	
	@FindBy(linkText = "Create a List")
	WebElement Create_a_List_Link_in_WishlistPage;
	
	@FindBy(name = "list-name")
	WebElement WishlistName;
	
	@FindBy(xpath = "(//input[@class='a-button-input a-declarative'])[2]")
	WebElement CreateList_Button;
	
	public void Add_to_wishlist_button_()
	{
		Add_to_wishlist_button.click();
	}
	
	public void CreateAnotherWishlistLink_()
	{
		CreateAnotherWishlistLink.click();
	}
	
	public void Add_To_Cart_Wishlist_Page_()
	{
		Add_To_Cart_Wishlist_Page.click();
	}
	
	public void Create_a_List_Link_in_WishlistPage_()
	{
		Create_a_List_Link_in_WishlistPage.click();
	}
	
	public void WishlistName_()
	{
		WishlistName.clear();
		WishlistName.sendKeys("Shopping List 10");
	}
	
	public void CreateList_Button_()
	{
		CreateList_Button.click();
	}
	
		
	public Amz_WishlistPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
