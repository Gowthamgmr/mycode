package week2.day3;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("email")).sendKeys("gowtham21j2000@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345678@GMR");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		System.out.println("The title of the page: "+driver.getTitle());
		
		driver.findElement(By.xpath("//li/a[text()='Log Out']")).click();
		driver.close();

	}

}
