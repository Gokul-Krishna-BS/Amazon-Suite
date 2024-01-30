package amazon;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class Amz_IT_05 extends LaunchQuit
{
	int flag=0;
	@Test
	public void Validation_of_searching_a_product_on_amazon_adding_it_to_cart_reaching_till_payments_page()
	{
		Amz_SearchResultPage a1=new Amz_SearchResultPage(driver);
		Amz_WishlistPage a2=new Amz_WishlistPage(driver);
		Amz_LoginPage a3=new Amz_LoginPage(driver);
		Amz_HomePage a4=new Amz_HomePage(driver);
		Amz_ProductDetailsPage a5=new Amz_ProductDetailsPage(driver);
		Amz_CheckoutPage a6=new Amz_CheckoutPage(driver);
		Utility_Class u1=new Utility_Class();
		a3.username_();
		a3.continue_button_();
		a3.password_();
		a3.SignIn_button_();
		a4.searchfield_();
		a1.Searchresults_();
		u1.switch_control_to_childwindow_(driver);
		a2.Add_to_wishlist_button_();
		a5.Add_to_cart_();
		try
		{
			a6.Proceed_to_checkout_button_();
		}
		catch(NoSuchElementException n1)
		{
			a6.Payment_method_Link_();
			flag++;
		}
		if(flag==0)
		{
			a6.Payment_method_Link_();
		}
		a6.credit_debitcard_radio_button_();
		a6.Card_details_link_();
		a6.switch_to_frame(driver);
		a6.card_number_();
		a6.Expirydate_month_();
		a6.Expirytdate_year_();
		a6.Enter_card_details_button_();
		
	}

}
