 package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amz_CheckoutPage
{
	WebDriver driver;
		
	@FindBy(xpath="//h3[@class='a-color-base clickable-heading expand-collapsed-panel-trigger']")
	WebElement DeliveryAddressLink;
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	WebElement ChooseAddressRadioButton;
	
	@FindBy(xpath="//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']")
	WebElement Proceed_to_checkout_button;
	
	@FindBy(xpath="(//h3[@class='a-color-base clickable-heading expand-collapsed-panel-trigger'])[2]")
	WebElement Payment_method_Link;
	
	@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
	WebElement credit_debitcard_radio_button;
	
	@FindBy(linkText="Enter card details")
	WebElement Card_details_link;
	
	@FindBy(tagName="iframe")
	WebElement Frame;
	
	@FindBy(xpath="//input[@name='addCreditCardNumber']")
	WebElement card_number;
	
	@FindBy(xpath="//select[@name='ppw-expirationDate_month']")
	WebElement Expirydate_month;
	
	@FindBy(xpath="//select[@name='ppw-expirationDate_year']")
	WebElement Expirytdate_year;
	
	@FindBy(name="ppw-widgetEvent:AddCreditCardEvent")
	WebElement Enter_card_details_button;
	
	public void DeliveryAddressLink_()
	{
		DeliveryAddressLink.click();
	}
	
	public void ChooseAddressRadioButton_()
	{
		ChooseAddressRadioButton.click();
	}
	
	public void Proceed_to_checkout_button_()
	{
		Proceed_to_checkout_button.click();
	}
		
	public void Payment_method_Link_()
	{
		Payment_method_Link.click();
	}
	
	public void credit_debitcard_radio_button_()
	{
		credit_debitcard_radio_button.click();
	}
	
	public void Card_details_link_()
	{
		Card_details_link.click();
	}
	
	public void switch_to_frame(WebDriver driver)
	{
		driver.switchTo().frame(Frame);
	}
	
	public void card_number_()
	{
		card_number.sendKeys("4712 2700 9928 8805");
	}
	
	public void Expirydate_month_()
	{
		Select s1=new Select(Expirydate_month);
		s1.selectByValue("5");
	}
	
	public void Expirytdate_year_()
	{
		Select s1=new Select(Expirytdate_year);
		s1.selectByValue("2027");
	}
	
	public void Enter_card_details_button_()
	{
		Enter_card_details_button.click();
	}
	
	public Amz_CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
