package Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class thirdTask {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.ajio.com/");
		
		WebElement men = driver.findElement(By.xpath("(//a[@class=' alignTag'])[1]"));
		String mentext = men.getText();
		System.out.println("the text = "+mentext);
		
		 System.out.println("----------------------");
		
		List<WebElement> webelements = driver.findElements(By.xpath("//a[@class=' alignTag']"));
		System.out.println("the webelements count = "+webelements.size());
		
		 System.out.println("----------------------");
		
		System.out.println(webelements.get(2).getText());
		System.out.println(webelements.get(3).getText());
		System.out.println(webelements.get(1).getText());
		System.out.println(webelements.get(4).getText());
        System.out.println(webelements.get(0).getText());
        
        System.out.println("----------------------");
        
        for(int i=0; i<webelements.size();i++) {
        	System.out.println(webelements.get(i).getText());
        }
	}

}
