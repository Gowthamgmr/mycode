package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		 driver.get("http://www.leafground.com/pages/sortable.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 WebElement item1 = driver.findElement(By.xpath("//ul/li[text()='Item 1']"));
		 WebElement item2 = driver.findElement(By.xpath("//ul/li[text()='Item 2']"));
		 WebElement item3 = driver.findElement(By.xpath("//ul/li[text()='Item 3']"));
		 WebElement item4 = driver.findElement(By.xpath("//ul/li[text()='Item 4']"));
		 WebElement item5 = driver.findElement(By.xpath("//ul/li[text()='Item 5']"));
		 WebElement item6 = driver.findElement(By.xpath("//ul/li[text()='Item 6']"));
		 WebElement item7 = driver.findElement(By.xpath("//ul/li[text()='Item 7']"));
		 Actions bulider=new Actions(driver);
		 bulider.clickAndHold(item2).moveToElement(item6).release().perform();
		 //builder.clickAndHold(item1).moveToElement(item5).perform();
		 

	}

}
