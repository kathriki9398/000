package ram;

import java.time.Duration;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOuseover {
	
	
	
	public static void main(String[] args) {
		
		
		

		WebDriver driver= new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Actions ss= new Actions(driver);
		
		
		ss.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Tech News']']")))
		
	.moveToElement(driver.findElement(By.xpath("//a[@href='https://www.hyrtutorials.com/search/label/Tutorials']")))
		.click().build().perform();
		
		
		
		
		
		
	}
	
	
	

}
