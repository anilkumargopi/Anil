package FileUpload;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workwithFileupload {

	public static void main(String[] args) throws AWTException, Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
		
		WebElement upload = driver.findElement(By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", upload);
		
		upload.click();
		
		String path = "D:\\ANIL_FILES\\magneq\\Selenium recording videos\\selenium documents\\Selenium-1.docx";
		
		StringSelection select = new StringSelection(path);
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
		clip.setContents(select, select);
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		
		robo.delay(3000);
		
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		WebElement delete = driver.findElement(By.xpath("//img[@src='//static.naukimg.com/s/7/104/assets/images/delete.fbc50c0e.svg']"));
		delete.click();
		
		
	}

}
