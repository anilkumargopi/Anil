package seleniumLocators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		System.out.println("parent : "+parent);
		
		driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
		
		driver.findElement(By.xpath("//button[@class='socialbtn google resman-btn-tertiary resman-btn-medium']")).click();
//		String childaddress = driver.getWindowHandle();
//		System.out.println("child : "+childaddress);
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println("total windows :"+allwindows.size());
		System.out.println(allwindows);
		
		for(String child : allwindows) {
		  if(!allwindows.equals(parent)) {
			driver.switchTo().window(child);
		  }	
		}
		
		driver.findElement(By.id("identifierId")).sendKeys("anil");
		
		
		
	}

}
