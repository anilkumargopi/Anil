package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NinthTask {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.naukri.com/");
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
//		WebElement viewallcompanies = driver.findElement(By.xpath("(//a[@class='view-all-comp'])[1]"));
//		jse.executeAsyncScript("arguments[0].scrollIntoView()", viewallcompanies);
		
		WebElement amazonlogo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		
		jse.executeAsyncScript("arguments[0].scrollIntoView()", amazonlogo);
		
//		WebElement elephantimg = driver.findElement(By.xpath("(//img[@class='product-image'])[1]"));
//		jse.executeAsyncScript("arguments[0].scrollIntoView()", elephantimg);

	}

}
