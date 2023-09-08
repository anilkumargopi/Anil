package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		
//		Thread.sleep(2000);
//		// id
//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("anilkumargopi157@gmail.com");
//	
//		// name
//		WebElement password = driver.findElement(By.name("pass"));
//		password.sendKeys("12345679");
//		
//		Thread.sleep(2000);
//		email.clear();
//		Thread.sleep(2000);
//		email.sendKeys("anilkumargopi110@gmail.com");
//		
//		//name= "login"
//		driver.findElement(By.name("login")).click();	
		
	
		//----------------------------------------------------------------------------------------------
		
		//tagname
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
         int linksCount =links.size();
         System.out.println("links count = "+linksCount);
         
         
         
         
         
		
		
	}

}
