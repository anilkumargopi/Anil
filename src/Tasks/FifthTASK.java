package Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FifthTASK {

	public static void main(String[] args) throws Exception {
       
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https:/www.google.com/");
		driver.navigate().to("https://demoqa.com/select-menu");
		
//		WebElement dropdowns = driver.findElement(By.);
//		
//		Select select = new Select(dropdowns);
//		select.selectByVisibleText("Prof.");
		
		WebElement dropdowns2 = driver.findElement(By.tagName("select"));
		
		Select select2= new Select(dropdowns2);
		
	    select2.selectByVisibleText("Yellow");
	    
	    List<WebElement> options = select2.getOptions();
	    System.out.println(options.size());
	    
	    for(int i=0;i<options.size();i++) {
	    	System.out.println(options.get(i).getText());
	    }
	    
	    for(WebElement ele : options) {
	    	System.out.println(ele.getText());
	    }
	    
	    System.out.println("-------------");
	    
	    select2.selectByValue("2");
	    
	    Thread.sleep(2000);
	    select2.selectByIndex(9);
	    
	    
		
		

	}

}
