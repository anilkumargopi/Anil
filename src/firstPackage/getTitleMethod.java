package firstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleMethod {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
//		Thread.sleep(2000);
//		
//		driver.navigate().to("https://facebook.com/");
//		Thread.sleep(2000);
		
		String title = driver.getTitle();
		System.out.println("the current title = "+title);
		

	}

}
