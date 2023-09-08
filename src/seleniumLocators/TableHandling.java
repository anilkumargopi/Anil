package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-pagination-demo.html");
		
		// handling table
		WebElement table = driver.findElement(By.xpath("//table[@class='table table-hover']"));
		
		//how many rows contains in table
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("totol rows in table : "+rows.size());
		System.out.println("----------------------------");
		
		//how many headers in table
		List<WebElement> heads  = table.findElements(By.tagName("th"));
		System.out.println("total heads in table:"+heads.size());
		System.out.println("----------------------------");
		//print header names 
		
		for(int i=0;i<heads.size();i++) {
			System.out.println(i+"."+heads.get(i).getText());
		}		
		System.out.println("----------------------------");
		for(WebElement ele : heads) {
			System.out.println(ele.getText());
		}
		System.out.println("----------------------------");

		//how many columns(table cells) contains in table
		List<WebElement> cols =table.findElements(By.tagName("td"));
		System.out.println("total tabledata cells : "+cols.size());
		System.out.println("----------------------------");
		
		//how many cols contains in single row
		List<WebElement> rowscols = rows.get(1).findElements(By.tagName("td"));
		System.out.println("single row coloumns : "+rowscols.size());
		
		System.out.println("------------------------------------------");
		
	    // show 14  individual rows contains 7 cols (first row = 7,second row 7) one time code
		
		for(int i=1;i<rows.size();i++) {
			List<WebElement> rowsCols = rows.get(i).findElements(By.tagName("td"));
			System.out.println("the row"+i+"conatins coloumns : "+rowsCols.size());
		}
		
		
		
	}

}

