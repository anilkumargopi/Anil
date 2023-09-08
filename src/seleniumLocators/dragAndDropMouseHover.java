package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropMouseHover {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		
		Actions act = new Actions(driver);
		
		for(int i=0;i<=5;i++) {
		act.keyDown(Keys.ARROW_DOWN).perform();
		}
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		act.doubleClick(drag).perform();
		Thread.sleep(2000);
		act.clickAndHold(drag).perform();
		Thread.sleep(2000);
		act.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		act.contextClick().perform();

	}

}
