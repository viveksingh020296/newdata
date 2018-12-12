package vivek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class facebooktest 
{

	
	  @Test
	 public void login()
	 {
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys("vivek");
		 driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("singh"); 
	 }
}
