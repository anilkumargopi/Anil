package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondTask {

	public static void main(String[] args) throws Exception {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.indeed.com/");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("current title = "+title);
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println("current url ="+url);
		Thread.sleep(2000);
		String address = driver.getWindowHandle();
		System.out.println("window address = "+address);
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(5000);
        driver.quit();

	}

}
