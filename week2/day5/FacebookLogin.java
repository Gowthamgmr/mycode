package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		driver.findElement(By.name("firstname")).sendKeys("Gowtham");
		driver.findElement(By.name("lastname")).sendKeys("Ramaswamy");
		driver.findElement(By.name("reg_email__")).sendKeys("gowthammr21j2000@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("gowthammr21j2000@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345678@GMR");
        WebElement dropdown1=driver.findElement(By.id("day"));
        Select day=new Select(dropdown1);
        day.selectByVisibleText("21");
		WebElement dropDown2 = driver.findElement(By.id("month"));
		Select month=new Select(dropDown2);
		month.selectByIndex(1);
		WebElement dropDown3 = driver.findElement(By.id("year"));
		Select year=new Select(dropDown3);
		year.selectByValue("2000");
		driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input")).click();
   }

}
