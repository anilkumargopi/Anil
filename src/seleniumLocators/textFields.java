package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textFields {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("firstName")).sendKeys("anil kumar");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Gopi");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Anil kumar");
		Thread.sleep(2000);
		driver.findElement(By.id("userEmail")).sendKeys("anilkumargopi157@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("8374028825");
		
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='custom-control custom-checkbox custom-control-inline'])[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='custom-control custom-checkbox custom-control-inline'])[3]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//div[@class='custom-control custom-checkbox custom-control-inline'])[2]")).click();
	    
	 
	    
		List<WebElement> radiobtns = driver.findElements(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']"));
		System.out.println("Total radio buttons count in web page = "+radiobtns.size());
		Thread.sleep(2000);
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']"));
		System.out.println("total checkboxes count in web page ="+checkboxes.size());
	    driver.quit();
	    
	    
		
		
		 
		
		
		

	}

}
