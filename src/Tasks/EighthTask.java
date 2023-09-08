package Tasks;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class EighthTask {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/#");
		String parent = driver.getWindowHandle();
		System.out.println("parent : "+parent);
		
		driver.findElement(By.xpath("//a[@class='addPrimaryTextColor']")).click();
		
		driver.findElement(By.xpath("//div[@class='googleTab socialLoginTab']")).click();
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
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("D:\\anil Selenium\\SeleniumPrograms\\screenshots\\switchtowindow.png");
		Files.copy(src, dst);
	}

}
