package training;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class automation {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

		Actions a = new Actions(driver);
		
		WebElement lang = driver.findElement(By.id("msdd"));
		lang.click();
		
		WebElement language = driver.findElement(By.xpath("//a[@class='ui-corner-all'][1]"));
		a.click(language).build().perform();
		
//		Robot r =new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
//		Select s = new Select(language);
//		s.selectByVisibleText("Arabic");
	}
}
