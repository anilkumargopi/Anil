package Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TenthTask {

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
		for(WebElement ele : cols) {
			System.out.println(ele.getText());
		}
		for(int a=0;a<cols.size();a++) {
			System.out.println(cols.get(a).getText());
		}
		System.out.println("------------------------------------");
		List<WebElement> heads = table.findElements(By.tagName("th"));
		System.out.println(heads.size());
		System.out.println("------------------------------------");
		
		for(int i=1;i<rows.size();i++) {
			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
			System.out.println(i+"row are "+col.size());
			
			for(int j=0;j<col.size();j++) {
//				if(i==2 && j==2) {
//					WebElement text = col.get(j).findElement(By.tagName("td"));
//					System.out.println(text.getText());
//				}
				if(i==3 && j==2) {
					col.get(j).findElement(By.tagName("input")).click();
					
				}
				else if(i==4 && j==3) {
					col.get(j).findElement(By.tagName("input")).click();
				}
				else if(i==5 && j==4) {
					WebElement dropdowns = col.get(j).findElement(By.tagName("select"));
					Select select = new Select(dropdowns);
					select.selectByValue("Sports");
				}
				else if(i==6 && j==5) {
					col.get(j).findElement(By.tagName("input")).sendKeys("Good");
				}
			}
		}
		

	}

}
