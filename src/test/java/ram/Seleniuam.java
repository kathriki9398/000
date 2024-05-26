package ram;

import java.util.List;

import javax.swing.plaf.basic.BasicArrowButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniuam {
	
	WebDriver driver;
	
	@BeforeClass
	public void ed() {
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
				
				
				driver.manage().window().maximize();
				
				driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
				
		
	}
	
	
	
@Test
	public void alert() {
	
		
		
		WebElement ram =driver.findElement(By.id("course"));
		
		Select wb = new Select(ram);
		List<WebElement> list = wb.getOptions();
		
		for(WebElement c: list) {
			
			
			System.out.println(c.getText());
		}
		
		
		wb.selectByIndex(1);
		
		wb.selectByIndex(2);
		
		String sd = wb.getFirstSelectedOption().getText();
		System.out.println(sd);
	}
@Test 

	public void r() {
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
				
				
				driver.manage().window().maximize();
				
				driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
				
		
		WebElement ram =driver.findElement(By.id("ide"));
		
		Select wb = new Select(ram);
		List<WebElement> list = wb.getOptions();
		
		for(WebElement c: list) {
			
			
			System.out.println(c.getText());
		}
		
		
		wb.selectByIndex(1);
		
		wb.selectByIndex(2);
		
		String sd = wb.getFirstSelectedOption().getText();
		System.out.println(wb.getFirstSelectedOption());
		System.out.println("iekidk"+sd);
		
	}
	@Test
public void q() {
	driver.quit();
}
}
