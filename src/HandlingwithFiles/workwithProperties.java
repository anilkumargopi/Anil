package HandlingwithFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workwithProperties {

	public static void main(String[] args) throws IOException {
		
		//to get the path of file;
		File f = new File("D:\\anil Selenium\\SeleniumPrograms\\properties\\Data.properties");
		
		//to read the data
		FileInputStream fis = new FileInputStream(f);
			
		//to handle the properties file
		Properties prop = new Properties();
		prop.load(fis);
		
		String username = prop.getProperty("name");
		System.out.println("username : "+username);
		String password = prop.getProperty("pass");
		System.out.println("password : "+password);
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys(prop.getProperty("name"));
		
		

	}

}
