package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/disapper.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement findElement = driver.findElement(By.id("btn"));
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.invisibilityOf(findElement));
			
		
		System.out.println(findElement.isDisplayed());
		boolean value=findElement.isDisplayed();
		Thread.sleep(3000);
		if(value==true) {
			System.out.println("the text is displayed");
		}else {
			System.out.println("the text not displayed");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
