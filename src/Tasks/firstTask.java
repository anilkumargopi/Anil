package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;

public class firstTask {

	public static void main(String[] args) throws Exception {
//		1.launch the chrome Browser
//		2.open google in first tab
//		3.navigate to facebook
//		4.perform back forward and refresh with the 2 seconds interval
//		5.after 2 seconds open myntra in second tab
//		6.after 3 seconds open amazon and maximize the window in third tab
//		7.after 4 seconds close the current tab
//		11.after 5 sec close the all tabs

		
		WebDriver driver = new ChromeDriver();
		driver .get("https://www.google.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		
		Thread.sleep(5000);
		driver.close();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
