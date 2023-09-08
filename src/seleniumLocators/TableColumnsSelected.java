package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TableColumnsSelected {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/webtable-example/");
		
		WebElement table = driver.findElement(By.xpath("//table[@class='tg']"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		System.out.println("------------------------------------");
		List<WebElement> cols = table.findElements(By.tagName("td"));
		System.out.println(cols.size());
		System.out.println("------------------------------------");
		List<WebElement> heads = table.findElements(By.tagName("th"));
		System.out.println(heads.size());
		System.out.println("------------------------------------");
		for(WebElement head : heads) {
			System.out.println(head.getText());
		}
		System.out.println("------------------------------------");
		
		for(int i=1;i<rows.size();i++) {
			System.out.println(rows.get(i).getText());
		}
		System.out.println("------------------------------------");
		
		for(int n=1;n<rows.size();n++) {
			List<WebElement> col = rows.get(n).findElements(By.tagName("td"));
			System.out.println(n+" row cols are "+col.size());
		}
		
		
		  for(int j=1;j<rows.size();j++) { 
			  for(int k=0;k<cols.size();k++) { 
				  if(j==1 && k==2) {
					  cols.get(k).findElement(By.tagName("input")).click();
				  }
				  else if(j==1 && k==3) {
					  cols.get(k).findElement(By.tagName("input")).click();
				  }
				  else if(j==1 && k==4) {
					  WebElement dropdown = cols.get(k).findElement(By.tagName("select"));
					  Select select = new Select(dropdown);
					  select.selectByValue("Sports");
				  }
				  else if(j==1 && k==5) {
					  cols.get(k).findElement(By.tagName("input")).sendKeys("good");
				  }
			        }
			       }
		 

	}

}
