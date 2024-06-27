package training;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
		
		WebElement sales =  driver.findElement(By.xpath("//a[@aria-label='Start free trial: Try Salesforce Starter Suite for free.']"));
		sales.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Set <String> windowhandles = driver.getWindowHandles();
//		List<String>win = new ArrayList<String>(windowhandles);
//		driver.switchTo().window(win.get(1));
//		
//		System.out.println(win.get(1));
//		
		
		
		System.out.println(windowhandles);
		for(String handle : windowhandles) {
			driver.switchTo().window(handle);
		}
		
	     Thread.sleep(3000);
	     
//	     driver.findElement(By.xpath("(//div[@class=\"checkbox-ui\"])[2]")).click();
		WebElement firstname = driver.findElement(By.name("UserFirstName"));
		firstname.sendKeys("Mohith");
//		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\Admin\\eclipse-workspace\\training\\mohith\\img.png");
		FileUtils.copyFile(f,path);
	}
}