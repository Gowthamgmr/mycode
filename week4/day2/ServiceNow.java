package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//Get UrL
		driver.get("https://dev80805.service-now.com/navpage.do");
		
		//Login the page
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Gowtham@123");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		//Click create new
		WebElement filter = driver.findElement(By.id("filter"));
		filter.sendKeys("incident");
		Thread.sleep(3000);
		filter.sendKeys(Keys.ENTER);
		
		//create new incident
		driver.switchTo().frame("gsft_main");
		WebElement incident=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		incident.click();
		driver.switchTo().defaultContent();
		
		//to get the incident number and verify for future
		driver.switchTo().frame(0);
		WebElement number=driver.findElement(By.id("incident.number"));
		String attribute=number.getAttribute("value");
		System.out.println(attribute);
		
		//fill the mandatory fields
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("Issues with incident");
		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
		driver.switchTo().defaultContent();
	
		//copy the incident number and paste it in search field and enter then verify the instance number created or not
		driver.switchTo().frame(0);
		WebElement searchInciNo = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		searchInciNo.sendKeys(attribute);
		Thread.sleep(2000);
		searchInciNo.sendKeys(Keys.ENTER);
		
		//to get the incident number for verification
		WebElement verifyNo = driver.findElement(By.xpath("//td[@class='vt']//a"));
		String incidentNo = verifyNo.getText();
		System.out.println(incidentNo);
		driver.switchTo().defaultContent();
		
		// verify the instance number created or not)
		if(attribute.equals(incidentNo)) {
			System.out.println("The Instance Is Created");
		}else {
			System.out.println("The Instance Is Not Created");
		}
		
		//To close
		Thread.sleep(2000);
		driver.close();
  }
}