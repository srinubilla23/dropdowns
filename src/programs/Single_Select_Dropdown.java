package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Select_Dropdown 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Jar Files\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://angularjs.org/");
		
		WebElement basic=driver.findElement(By.xpath("//*[contains(@class, 'dropdown-toggle')]"));
		basic.click();
		
		driver.findElement(By.xpath("//*[contains(@class, 'dropdown open')]/descendant::*[3]")).click();
		//driver.findElement(By.xpath("//*[contains(text(), '0 - Bootstrapping')]")).click();
		
		WebElement dd=driver.findElement(By.xpath("//*[contains (@ng-model, '$ctrl.selectedVersion')]"));
		dd.click();
		Select s=new Select(dd);
		s.getOptions();
		s.selectByIndex(5);
		//s.selectByIndex(5);
		/*Actions a=new Actions(driver);
		
		Thread.sleep(3000);
		a.click(s.getOptions().get(5)).build().perform();*/
	}
}
