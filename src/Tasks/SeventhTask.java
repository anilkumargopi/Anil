package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeventhTask {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//https://demo.automationtesting.in/Alerts.html
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		// alert with ok
	    driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(3000);
		String msg = driver.switchTo().alert().getText();
		System.out.println("message : "+ msg);
	    driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		System.out.println("---------------------------------------------------");
		//alert with ok and cancel
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		String msg1 = driver.switchTo().alert().getText();
		System.out.println("message : "+ msg1);
		driver.switchTo().alert().accept();
		String ok = driver.findElement(By.id("demo")).getText();
		System.out.println("message : "+ ok);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		String cancel = driver.findElement(By.id("demo")).getText();
		System.out.println("message : "+ cancel);
		Thread.sleep(3000);
		
		System.out.println("------------------------------------------------------");
		//alert with prompt box
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Anil kumar");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		String text = driver.findElement(By.id("demo1")).getText();
		System.out.println("message : "+text);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		//driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		//driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
//	    driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	    //Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}

}
