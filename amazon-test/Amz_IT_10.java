package amazon;

import org.testng.annotations.Test;

public class Amz_IT_10 extends LaunchQuit
{
	@Test
	public void Validation_of_creating_different_wishlist() throws InterruptedException
	{
		Amz_LoginPage a3=new Amz_LoginPage(driver);
		Amz_HomePage a1=new Amz_HomePage(driver);
		Amz_WishlistPage a2=new Amz_WishlistPage(driver);
		a3.username_();
		a3.continue_button_();
		a3.password_();
		a3.SignIn_button_();
		a1.Accounts_Lists_Link_(driver);
		a1.Your_Wish_List_Link_();
		a2.Create_a_List_Link_in_WishlistPage_();
		Thread.sleep(3000);
		a2.WishlistName_();
		a2.CreateList_Button_();
		
	}

}
