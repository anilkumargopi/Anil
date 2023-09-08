package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//using frame name
	   // driver.switchTo().frame("singleframe");
		
		//using index (but its not working beacuse frames alawys changed.)
		//driver.switchTo().frame(3);
		Thread.sleep(2000);
		
		//using web element
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frameElement);		
	    
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("anil");
		
		

	}

}
