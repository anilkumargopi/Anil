package HandlingwithFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class workwithCrossBrowsing {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException, Exception {
		
		File f = new File("D:\\anil Selenium\\SeleniumPrograms\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties prop =new Properties();
		prop.load(fis);
		
		String browserValue = prop.getProperty("browser");
		System.out.println("The Browser is : "+browserValue);
		
		if(browserValue.equalsIgnoreCase("Chrome")) {
		 driver = new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		else if(browserValue.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("the browser is not found");
		}
//		driver.get("https://www.google.com/");
//		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys(prop.getProperty("name"));
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("usernamepath"))).sendKeys(prop.getProperty("username"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("userpasspath"))).sendKeys(prop.getProperty("userpass"));
		Thread.sleep(3000);
//		driver.findElement(By.xpath(prop.getProperty("eyeiconpath"))).click();
		

	}

}
