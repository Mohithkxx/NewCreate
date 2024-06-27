package training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		
		driver.manage().window().maximize();
		
		//particular element
		
		WebElement table = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr[2]/td[4]"));
		
		System.out.println(table.getText());
		
		
		//all data
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr/td"));
		
		for(WebElement element : alldata) {
			
			System.out.println(element.getText());
			
		}
		
	}

}
