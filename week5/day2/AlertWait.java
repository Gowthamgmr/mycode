package week5.day2;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AlertWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.leafground.com/pages/alertappear.html");
		WebElement element = driver.findElement(By.xpath("//button[@id='alert']"));
		element.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Alert until = wait.until(ExpectedConditions.alertIsPresent());
		until.accept();
		System.out.println("Alert is handeled");

	}

}
