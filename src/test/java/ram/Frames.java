package ram;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	
@Test

	
	public void frames() throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.findElement(By.id("name")).sendKeys("kathrikI");
		
		driver.switchTo().frame("frm1");
		
		
		
		Select ram= new Select(driver.findElement(By.id("course")));
		
		
		List<WebElement> list = ram.getOptions();
		
		
		for(WebElement c:list) {
			
			System.out.println(c.getText());
		}
		
		ram.selectByIndex(2);
		
		ram.selectByIndex(1);
		
		
		
		String v= ram.getFirstSelectedOption().getText();
		
		System.out.println(ram);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("name")).clear();
		
		WebElement rr=driver.findElement(By.id("name"));
		
		rr.sendKeys("mani"
				);
		
		System.out.println(rr.getAttribute("value"));
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File file= ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("./Screen/image.jpg"));
		
		




	
}
	
	

}
