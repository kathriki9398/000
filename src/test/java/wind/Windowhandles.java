package wind;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandles {
	
	
	public static boolean ram(String s1,String s2) {
		
		String str1= s1.replaceAll("\\s", "");
		
		String str2= s2.replaceAll("\\s", "");
		
		
		if(str1.length()!=str2.length()) {
			
			return false;
			
		}else {
			char[] c=str1.toLowerCase().toCharArray();
					char[] c2=str2.toLowerCase().toCharArray();
			
			Arrays.sort(c);
			Arrays.sort(c2);
			return Arrays.equals(c, c2);
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		
		
		
		
		System.out.println(ram("idkiw","kiwl"));
		
		
		
		
		
		
		
	}

}
