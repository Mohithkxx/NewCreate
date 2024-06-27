package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumsa {
    
	public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page");
		
		driver.findElement(By.id("checkBox1")).click();
		
		WebElement Drag1 = driver.findElement(By.id("logo"));
		
		WebElement Drag2 = driver.findElement(By.xpath("//div[@id='drop2']"));
		
		Actions a = new Actions(driver);
		
		//a.dragAndDrop(Drag1, Drag2).build().perform();
		
        //a.moveToElement(Drag2).build().perform();
		
		a.clickAndHold(Drag1).build().perform();
		
		a.moveToElement(Drag2).release().build().perform();
		
	}
}