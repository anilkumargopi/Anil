package Tasks;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SixthTask {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
		//Thread.sleep(3000);
		
		//driver.findElement(By.id("email")).sendKeys("anilkumargopi157");
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Anil");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("kumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("anilkumargopi1@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[4]")).sendKeys("anilkumargopi1@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("Anil@123");
		Thread.sleep(2000);
		
		WebElement daydropdowns = driver.findElement(By.id("day"));
		
		Select select = new Select(daydropdowns);
	    //get list of day drop down
		List<WebElement> day = select.getOptions();
		System.out.println(day.size());
		
		//print day texts using for loop
		for(int i=0;i<day.size();i++) {
			System.out.println(day.get(i).getText());
		}
		System.out.println("--------------------------");
		//print day texts using for each
		for(WebElement ele : day) {
			System.out.println(ele.getText());
			
		}
		
		//using select by visible
		select.selectByVisibleText("1");
		
		System.out.println("-------------------------------------------------------------------------------");
		
		WebElement monthdropdowns = driver.findElement(By.id("month"));
		
		Select select1 = new Select(monthdropdowns);
		//get list of month drop down
		List<WebElement> months = select1.getOptions();
		System.out.println(months.size());
		//print month texts using for loop
		for(int j=0;j<months.size();j++) {
			System.out.println(months.get(j).getText());
		}
		System.out.println("--------------------------");
		//print month texts using for each
		for(WebElement ele1 : months) {
			System.out.println(ele1.getText());
		}
		//using select by index value
		select1.selectByIndex(9);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		WebElement yeardropdowns = driver.findElement(By.id("year"));
		
		Select select2 = new Select(yeardropdowns);
		//get list of years drop down
		List<WebElement> years =select2.getOptions();
		System.out.println(years.size());
		//print years texts using for loop
		for(int k=0;k<years.size();k++) {
			System.out.println(years.get(k).getText());
		}
		System.out.println("--------------------------------");
		//print years texts using for each
		for(WebElement ele2 : years) {
			System.out.println(ele2.getText());
		}
		
		//using select by value
		select2.selectByValue("1997");
		
		System.out.println("-------------------------------------------------------------------------------");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
		
		Thread.sleep(2000);
		TakesScreenshot tss = (TakesScreenshot) driver;
		File src= tss.getScreenshotAs(OutputType.FILE);
		File dst= new File("D:\\anil Selenium\\SeleniumPrograms\\screenshots\\facebookCreateAccountPhoto.png");
		Files.copy(src, dst);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
		
		
		Thread.sleep(10000);
		TakesScreenshot tss1 = (TakesScreenshot) driver;
		File src1= tss1.getScreenshotAs(OutputType.FILE);
		File dst1= new File("D:\\anil Selenium\\SeleniumPrograms\\screenshots\\facebookaftersignupphoto.png");
		Files.copy(src1, dst1);
		
		
		
		
		
		
		
		
		
		
		

	}

}
