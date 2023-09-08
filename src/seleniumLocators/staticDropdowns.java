package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdowns {

	public static void main(String[] args) {
		// static dropdowns
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	    
	     WebElement dropdowns= driver.findElement(By.tagName("select"));
	     Select select = new Select(dropdowns);
	     
	     List<WebElement> allOptions = select.getOptions();
	     System.out.println(allOptions.size());
	     
	     for(int i=0;i<allOptions.size();i++) {
	    	 System.out.println(allOptions.get(i).getText());
	     }
	     
	     for(WebElement ele :allOptions){
	    	 System.out.println(ele.getText());
	     }
	     
	     System.out.println("-----------------------");
	     select.selectByVisibleText("Zambia");
	     System.out.println("-----------------------");
	     select.selectByIndex(20);
	     System.out.println("-----------------------");
	     select.selectByValue("IND");
	     

	}

}
