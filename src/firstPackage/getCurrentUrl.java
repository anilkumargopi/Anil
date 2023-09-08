package firstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.myntra.com");
		
		String url = driver.getCurrentUrl();
		
		System.out.println("first url ="+url);
		
		
//		Thread.sleep(20000);
//		
//		driver.navigate().to("https://www.amazon.in");
//		
//		String url2 = driver.getCurrentUrl();
//		System.out.println("second url ="+url2);
		

	}

}
