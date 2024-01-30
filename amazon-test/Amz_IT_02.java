package amazon;

import org.testng.annotations.Test;

public class Amz_IT_02 extends LaunchQuit
{
	@Test
	public void Validationofsearchingaproductonamazon()
	{
		Amz_LoginPage a1=new Amz_LoginPage(driver);
		a1.username_();
		a1.continue_button_();
		a1.password_();
		a1.SignIn_button_();
		
		Amz_HomePage a2= new Amz_HomePage(driver);
		a2.searchfield_();
		
	}

}
