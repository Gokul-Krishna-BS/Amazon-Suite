package amazon;

import org.testng.annotations.Test;

public class Amz_IT_07 extends LaunchQuit
{
	@Test
	public void Validation_of_Address_Page()
	{
		Amz_SearchResultPage a1=new Amz_SearchResultPage(driver);
		Amz_WishlistPage a2=new Amz_WishlistPage(driver);
		Amz_LoginPage a3=new Amz_LoginPage(driver);
		Amz_HomePage a4=new Amz_HomePage(driver);
		Amz_ProductDetailsPage a5=new Amz_ProductDetailsPage(driver);
		Amz_ShoppingCartPage a6= new Amz_ShoppingCartPage(driver);
		Amz_CheckoutPage a7=new Amz_CheckoutPage(driver);
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
		a6.Proceed_to_buy_button_();
		a7.DeliveryAddressLink_();
		a7.ChooseAddressRadioButton_();
	}

}
