package firstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandleMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String window1 = driver.getWindowHandle();
		System.out.println("the window1 address ="+window1);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.myntra.com");
		
		String window2 = driver.getWindowHandle();
		System.out.println("the window2 address ="+window2);
		
	

	}

}
