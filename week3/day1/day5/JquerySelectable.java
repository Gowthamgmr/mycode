package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JquerySelectable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(options);
		options.addArguments("--disable-notifications");
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		driver.switchTo().frame(0);
		WebElement option1 = driver.findElement(By.xpath("//ol/li[text()='Item 1']"));
		WebElement option2 = driver.findElement(By.xpath("//ol/li[text()='Item 2']"));
		WebElement option3 = driver.findElement(By.xpath("//ol/li[text()='Item 3']"));
		WebElement option4 = driver.findElement(By.xpath("//ol/li[text()='Item 4']"));
		WebElement option5 = driver.findElement(By.xpath("//ol/li[text()='Item 5']"));
		WebElement option6 = driver.findElement(By.xpath("//ol/li[text()='Item 6']"));
		WebElement option7 = driver.findElement(By.xpath("//ol/li[text()='Item 7']"));
		Actions build=new Actions(driver);
		build.keyDown(Keys.CONTROL).click(option1).click(option2).click(option3).click(option4).release().perform();
		
	}
	
}


