package Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthTask {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.amazon.in/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
	    int totalLinks = links.size();
	    System.out.println("total links count in amazon webiste :"+totalLinks);
	    System.out.println("-------------------------------------------------");
	    
	    for(int i=0;i<totalLinks;i++) {
	    	System.out.println(links.get(i).getText());
	    }
	    
	    System.out.println("-------------------------------------------------");
	    
	    int count =0;
	    for(int i=0;i<totalLinks;i++) {
	    	
	    	if(links.get(i).isDisplayed()) {
	    		count++;
	    	}
	    }
	    
	    System.out.println("-------------------------------------------------");
	    
	    int visibleLinks = count;
	    System.out.println("visible Links in amazon website :" + visibleLinks);
	    
	    int InvisibleLinks = totalLinks - visibleLinks;
	    System.out.println("Invisible Links in amazon website :" + InvisibleLinks);
	    

	}

}
