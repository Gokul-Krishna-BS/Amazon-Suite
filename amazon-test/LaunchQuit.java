package amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit
{
	WebDriver driver;
	@BeforeMethod
	public void launch()
	{ 
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_"
				+ "age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%"
				+ "2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26"
				+ "useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%"
				+ "3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid."
				+ "mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}
}
