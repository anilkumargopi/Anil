package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithGetSize {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		
		WebElement	 logo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		System.out.println(logo.getSize());
		
		List<WebElement> elements = driver.findElements(By.tagName("img"));
		System.out.println(elements.size());
		
		for(int i=0;i<elements.size();i++) {
			System.out.println(elements.get(i).getSize());
		}
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int j=0;j<links.size();j++) {
			System.out.println(links.get(j).getText()+" : "+links.get(j).getAttribute("href"));
		}
		
		
        

	}

}
