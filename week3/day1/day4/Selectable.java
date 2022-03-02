package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		 driver.get("http://www.leafground.com/pages/selectable.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 WebElement option1 = driver.findElement(By.xpath("//ol/li[text()='Item 1']"));
		 WebElement option2 = driver.findElement(By.xpath("//ol/li[text()='Item 2']"));
		 WebElement option3 = driver.findElement(By.xpath("//ol/li[text()='Item 3']"));
		 WebElement option4 = driver.findElement(By.xpath("//ol/li[text()='Item 4']"));
		 WebElement option5 = driver.findElement(By.xpath("//ol/li[text()='Item 5']"));
		 WebElement option6 = driver.findElement(By.xpath("//ol/li[text()='Item 6']"));
		 WebElement option7 = driver.findElement(By.xpath("//ol/li[text()='Item 7']"));
		 Actions bulider=new Actions(driver);
		 //trace the mouse
		 bulider.clickAndHold(option1).moveToElement(option6).release().perform();
		 //selected only
		 bulider.keyDown(Keys.CONTROL).click(option1).click(option5).release().perform();
		 
		 
		 
		

	}

}
