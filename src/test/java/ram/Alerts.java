package ram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
	
	
	@Test
public void alert() {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	
	driver.findElement(By.id("alertBox")).click();
			
		System.out.println(driver.switchTo().alert());
		
	driver.switchTo().alert().accept();
	
	System.out.println(driver.findElement(By.id("output")).getText());
		
		
	driver.findElement(By.id("confirmBox")).click();
	
	System.out.println(driver.switchTo().alert());
	
driver.switchTo().alert().dismiss();

System.out.println(driver.findElement(By.id("output")).getText());
	
		
	
}
	
	
	

}
