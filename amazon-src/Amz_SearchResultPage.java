package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_SearchResultPage
{
	WebDriver driver;
	@FindBy(xpath="(//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style'])[2]")
	WebElement Searchresults;
	
	public void Searchresults_()
	{
		Searchresults.click();
	}
		
	public Amz_SearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}









