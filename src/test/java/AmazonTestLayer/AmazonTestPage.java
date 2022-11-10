package AmazonTestLayer;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AmazonPlageLayer.AmazonHomePage;

public class AmazonTestPage
{
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\AUTOMATION TESTING\\DAILY NOTES SELENIUM\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().deleteAllCookies();
		
		 AmazonHomePage amazon=new AmazonHomePage(driver);
		 amazon.SearchProduct("Boat headphone 550");
		 amazon.clickOnSearchButton();
		 amazon.clickOnBoatAudio();
		 amazon.searchBoat("Airpods");	
		 amazon.SearchProduct2("JBL speakers");
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		 wait.until(ExpectedConditions.numberOfWindowsToBe(1));
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(1000,4000)");
		 amazon.prodPrice();
		 amazon.clickOnJblGo2();
		 String pid=driver.getWindowHandle();
		 Set<String> cid=driver.getWindowHandles();
		 System.out.println(pid);
		 System.out.println(cid);
		 for(String id:cid)
		 {
			 if(!(id.equals(pid)))
			 {
				 driver.switchTo().window(id);
				 
			 }
		 }

	}
}
