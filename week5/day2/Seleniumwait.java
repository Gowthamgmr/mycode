package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumwait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/appear.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement findElement = driver.findElement(By.id("btn"));
		
		//Thread.sleep(5000);
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOf(findElement));
		
		System.out.println(findElement.isDisplayed());
		Thread.sleep(3000);
		driver.quit();
		
		
		
		

	}

}
