package training;

import java.time.Duration;
import java.util.Iterator;
//import org.zeromq.ZStar.Set;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.seleniumhq.selenium:selenium-devtools-v86:4.12.1;

public class Getwindow_Handles {
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        //Actions a = new Actions();
        
        
        driver.get("https://www.flipkart.com/");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("shirt");
        searchBox.sendKeys(Keys.ENTER);

        WebElement product = driver.findElement(By.className("IRpwTa"));
        product.click();

        // Get the current window handle
        String parentWindowHandle = driver.getWindowHandle();

        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();

        // Switch to the new window/tab
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Add the product to the cart
        Thread.sleep(2000);
        WebElement add = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")); // Updated XPath for Add to Cart button
        add.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebElement increase = driver.findElement(By.xpath("//button[text()='+']"));
//WebDriverWait ww=new WebDriverWait(driver, Duration.ofSeconds(30));
//ww.until(ExpectedConditions.elementToBeClickable(increase));

WebElement increase1 = driver.findElement(By.xpath("(//button[@class='_23FHuj'])[2]"));
//increase1.click();Thread.sleep(2000);
//increase1.click();Thread.sleep(2000);
//increase1.click();Thread.sleep(2000);
//increase1.click();Thread.sleep(2000);
//increase1.click();Thread.sleep(2000);
//increase1.click();Thread.sleep(2000);
//increase1.click();Thread.sleep(2000);
//increase1.click();Thread.sleep(2000);
//increase1.click();Thread.sleep(2000);
for (int i = 0; i < 10; i++) {
	increase1.click();Thread.sleep(2000);
}
//for (int i = 0; i < 10; i++) {
//	increase.click();
//}

        
    }

}

