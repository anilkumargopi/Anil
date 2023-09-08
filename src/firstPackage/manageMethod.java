package firstPackage;

import javax.swing.text.TabableView;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class manageMethod {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https:facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
	}

}
