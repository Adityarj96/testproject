package Generic;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Basepage1
{
	public WebDriver driver;
	public Basepage1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void elementvisiblity(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			//driver.findElement(By.xpath("//a[text()='Admin Panel']"));
			Reporter.log("element is displayed",true);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			Reporter.log("element not displayed", true);
			Assert.fail();
		}
	}
		public void titlewait(String title)
		{
			WebDriverWait wait=new WebDriverWait(driver, 10);
			try
			{
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("title is matching", true);
			}
			catch(Exception e)
			{
				Reporter.log("title is not matching", true);
				Assert.fail();
			}


}
}


