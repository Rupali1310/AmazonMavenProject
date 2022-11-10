package AmazonPlageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage
{	
	public AmazonHomePage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")private WebElement search_product ;
	public void SearchProduct(String productname)
	{
		search_product.sendKeys(productname);
	}
	@FindBy(xpath="//input[@id='nav-search-submit-button']")private WebElement click_on_search_button ;

	public void clickOnSearchButton()
	{
		click_on_search_button.click();
	}
	
	
	
	@FindBy(xpath="//span[@class='a-truncate-cut']")private WebElement boat_Audio;
	
	public void clickOnBoatAudio() 
	{
		boat_Audio.click();
	}
	
	@FindBy(xpath="//input[@class='SearchInput__input__IGt2m']")private WebElement search_boat;
	
	public void searchBoat(String airpods)
	{
		search_boat.sendKeys(airpods+Keys.ENTER);	;
		
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")private WebElement search_product2 ;
	public void SearchProduct2(String productname1)
	{
		search_product2.sendKeys(productname1+Keys.ENTER);
	}
	
	@FindBy(partialLinkText="JBL Go 2") private WebElement jbl_go_2 ;
	
   public void clickOnJblGo2()
	{	
	   jbl_go_2.click();
     
	}
 @FindBy(xpath="(//span[@class='a-price-whole'])[6]")private WebElement prod_price;
	public void prodPrice()
	{
	 String price=prod_price.getText();
	 System.out.println(price);
	}
}
