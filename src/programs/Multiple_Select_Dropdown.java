package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Select_Dropdown {

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Jar Files\\Drivers\\chromedriver.exe");
		ChromeOptions ab=new ChromeOptions();
		ab.addArguments("--disable-notifications");
		ab.addArguments("start-maximized");
		driver=new ChromeDriver(ab);
		//driver.manage().window().maximize();
		driver.get("https://mdbootstrap.com/docs/jquery/forms/multiselect/");
		
		WebElement mdd=driver.findElement(By.xpath("(//*[contains(@class, 'select-wrapper mdb-select colorful-select dropdown-primary md-form')])[1]"));
		
		if(mdd.isDisplayed())
		{
			System.out.println("dropdown display");
		}
		else
		{
			System.out.println("no dropdown display");
		}
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", mdd);
		
		Select sselect=new Select(mdd);
		
		Actions mselect=new Actions(driver);
		
		mselect.click(sselect.getOptions().get(3)).build().perform();
		mselect.click(sselect.getOptions().get(4)).build().perform();
	}

}
