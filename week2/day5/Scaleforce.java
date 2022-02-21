package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scaleforce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("UserFirstName")).sendKeys("Gowtham");
		driver.findElement(By.name("UserLastName")).sendKeys("Ramaswamy");
		driver.findElement(By.name("UserEmail")).sendKeys("gowtham21j2000@gmail.com");
		WebElement dropDown1 = driver.findElement(By.name("UserTitle"));
		Select jobTitle=new Select(dropDown1);
		jobTitle.selectByVisibleText("IT Manager");
		driver.findElement(By.name("CompanyName")).sendKeys("Zoho");
		WebElement dropDown2 = driver.findElement(By.name("CompanyEmployees"));
		Select employees=new Select(dropDown2);
		employees.selectByValue("1600");
		driver.findElement(By.name("UserPhone")).sendKeys("7305557351");
		driver.findElement(By.className("checkbox-ui")).click();
	  }
}
