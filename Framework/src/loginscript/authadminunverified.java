package loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Basetestauthlogin;
import Generic.input;
import loginpage.authLogin;

public class authadminunverified extends Basetestauthlogin 
{
	@Test
	public void Test() throws InterruptedException
	{
		authLogin adminverified=new authLogin(driver);
		
		adminverified.authusername(input.getdata(excel, "sheet2", 6, 1));
		adminverified.authpassword(input.getdata(excel, "sheet2", 7, 1));
		adminverified.clcikauthloginbuttion();
		WebElement unverifiedtextbox = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div"));
		adminverified.elementvisiblity(unverifiedtextbox);
		
		
	}

}
