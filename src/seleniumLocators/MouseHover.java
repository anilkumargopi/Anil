package seleniumLocators;





import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
        Actions act = new Actions(driver);
//		
//		WebElement men = driver.findElement(By.xpath("(//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK'])[3]"));
//		
//		//mouse hover
//        act.moveToElement(men).perform();
//        Thread.sleep(2000);
//      
//        driver.findElement(By.xpath("(//a[@class='sub-list-item pointer'])[42]")).click();
//        act.doubleClick(men).perform();
	    
	    for(int i=0;i<=10;i++) {
	        act.keyDown(Keys.ARROW_DOWN).perform();
	    }
	    
	    Thread.sleep(2000);
	    // we cannot operate at a time all mouse actions only one action we can use.
//	    for(int j=0;j<=10;j++) {
//	    	act.keyUp(Keys.ARROW_UP).perform();
//	    }
	    
	    
	    
	    //drag and drop
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
        
		
	}
}
