package ram;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver= new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		
	driver.findElement(By.id("name")).sendKeys("ramanJI");
	
	
	driver.switchTo().frame("frm1");
WebElement ram= driver.findElement(By.id("course"));
Select r= new Select(ram);

r.selectByIndex(2);
Actions act= new Actions(driver);

//act.scrollToElement(r.selectByIndex(2)).perform();
List<WebElement>list = driver.findElements(By.id("course"));


for(WebElement c:list) {
	
System.out.println(c.getText());
}
		r.selectByIndex(3);
		
		String s= r.getFirstSelectedOption().getTagName();
		
		System.out.println(s);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("name")).clear();
		
		driver.findElement(By.id("name")).sendKeys("123424");
		
	}


	

}
