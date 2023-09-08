package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingWithJavascriptExecutor {

	public static void main(String[] args) {

     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demoqa.com/alerts");
     
     //to scroll the page up to target element we need to use javascript executor
     
     JavascriptExecutor jse = (JavascriptExecutor)driver;
     
     WebElement promptboxbtn = driver.findElement(By.id("promtButton"));
     jse.executeAsyncScript("arguments[0].scrollIntoView()", promptboxbtn);
     
	}
}
