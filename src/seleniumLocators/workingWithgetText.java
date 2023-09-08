package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithgetText {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.meesho.com/");
		
		WebElement elementtext = driver.findElement(By.xpath("(//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK'])[3]"));
		String text = elementtext.getText();
		System.out.println("the element text = "+text);
		
		List<WebElement> ElementsTextInMeesho = driver.findElements(By.xpath("//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK']"));
		System.out.println("total webelements count in meesho = "+ElementsTextInMeesho.size());
		
		System.out.println(ElementsTextInMeesho.get(0).getText());
		System.out.println(ElementsTextInMeesho.get(8).getText());
		
		for(int i=0;i<ElementsTextInMeesho.size();i++) {
			System.out.println(ElementsTextInMeesho.get(i).getText());
		}
	}

}
