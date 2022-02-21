package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("input-username")).sendKeys("Gowtham2000");
		driver.findElement(By.id("input-firstname")).sendKeys("Gowtham");
		driver.findElement(By.id("input-lastname")).sendKeys("Ramaswamy");
		driver.findElement(By.id("input-email")).sendKeys("Gowtham2000@gmail.com");
		WebElement dropDown1 = driver.findElement(By.id("input-country"));
		Select country=new Select(dropDown1);
		country.selectByVisibleText("India");
		driver.findElement(By.id("input-password")).sendKeys("12345678@GMR");
	}

}
