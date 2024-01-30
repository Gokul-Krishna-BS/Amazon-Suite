package amazon;

import org.testng.annotations.Test;

public class Amz_IT_01 extends LaunchQuit
{
	@Test
	public void Toverifyloginfunctionalitywithvaliddata()
	{
		Amz_LoginPage a1=new Amz_LoginPage(driver);
		a1.username_();
		a1.continue_button_();
		a1.password_();
		a1.SignIn_button_();
	}

}
