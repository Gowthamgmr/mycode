package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvanceXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		  driver.findElement(By.xpath("//form[@id='login']//input[@id='username']")).sendKeys("Demosalesmanager");
		  driver.findElement(By.xpath("//form[@id='login']//input[@id='password']")).sendKeys("crmsfa"); 
		  driver.findElement(By.xpath("//form[@id='login']//input[@class='decorativeSubmit']")).click();
		  driver.findElement(By.xpath("")).sendKeys("Demosalesmanager");
		  driver.findElement(By.xpath("")).sendKeys("crmsfa");
		  driver.findElement(By.xpath("")).click();
		}

}
