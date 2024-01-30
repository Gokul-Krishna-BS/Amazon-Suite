package amazon;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class Amz_IT_11 extends LaunchQuit
{
	@Test
	public void Validation_of_adding_product_from_wishlist_to_the_cart()
	{
		Amz_LoginPage a3=new Amz_LoginPage(driver);
		Amz_HomePage a1=new Amz_HomePage(driver);
		Amz_WishlistPage a2= new Amz_WishlistPage(driver);
		Amz_SearchResultPage a4= new Amz_SearchResultPage(driver);
		Utility_Class u1=new Utility_Class();
		a3.username_();
		a3.continue_button_();
		a3.password_();
		a3.SignIn_button_();
		a1.Accounts_Lists_Link_(driver);
		a1.Your_Wish_List_Link_();
		try
		{
			a2.Add_To_Cart_Wishlist_Page_();

		}
		catch(ElementNotInteractableException e1)
		{
			a1.searchfield_();
			a4.Searchresults_();
			u1.switch_control_to_childwindow_(driver);
			a2.Add_to_wishlist_button_();
			a1.Accounts_Lists_Link_(driver);
			a1.Your_Wish_List_Link_();
			a2.Add_To_Cart_Wishlist_Page.click();
			
		}
		catch(NoSuchElementException n1)
		{
			a1.searchfield_();
			a4.Searchresults_();
			u1.switch_control_to_childwindow_(driver);
			a2.Add_to_wishlist_button_();
			a1.Accounts_Lists_Link_(driver);
			a1.Your_Wish_List_Link_();
			a2.Add_To_Cart_Wishlist_Page.click();

		}

	}

}
