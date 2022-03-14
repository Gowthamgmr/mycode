package week5.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitTextChange {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/TextChange.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	   WebElement ele = driver.findElement(By.xpath("//button[text()='Click ME!']"));
		
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click ME!']")));
		
		ele.click();
		
		System.out.println(ele.isDisplayed());
		
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

}
