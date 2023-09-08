package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdowns {
public static void main(String[] args) throws Exception {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("ramcharan");
	Thread.sleep(2000);
	List<WebElement> ramcharanList = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	
	System.out.println(ramcharanList.size());
	
//	for(WebElement ele : ramcharanList) {
//		System.out.println(ele.getText());
//	}
	
//	System.out.println("---------------------------");
	
	
//	for(int i=0;i<ramcharanList.size();i++) {
//		System.out.println(ramcharanList.get(i).getText());
//	}
	
	// click on ramcharan 

//	driver.findElement(By.xpath("(//div[@class='wM6W7d'])[5]")).click();
	
	System.out.println("-----------------------------------------------");
	// searching words in dynamic drop downs if word match click that word or else shows not found
	for(int i=0;i<ramcharanList.size();i++) {
		if(ramcharanList.get(i).getText().contains("ram charan daughter")) {
			ramcharanList.get(i).click();
			break;
		}else {
			System.out.println("Not found ");
			break;
		}
	}
	
	
}
}
