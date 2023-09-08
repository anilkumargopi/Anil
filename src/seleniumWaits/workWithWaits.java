package seleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class workWithWaits {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// using implicit wait -->  whenever web driver found web element then does not waited .suppose if u give 20sec wait time,then web driver found web element
		// in 3 sec then implicit wait stops. so it does not waited remaining 17 seconds
		// implicit wait --> it is waited for whole program

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/progress-bar");
		driver.findElement(By.id("startStopButton")).click();


		// thread.sleep --> whenever web driver found web element then its waited .suppose if u give 20 sec wait time,then web driver found web element
		// in 3 sec then thread. sleep not stopped .so it is waited untill complete the 20 sec.
		//Thread.sleep(15000);

		//using explicit wait--> work with given condition for visibility of element located ,untill to found the web element then its stopped
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetButton")));

		driver.findElement(By.id("resetButton")).click();









	}

}
