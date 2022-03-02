package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDealProducts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(options);
		options.addArguments("--disable-notifications");
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions builder=new Actions(driver);
		WebElement mens = driver.findElement(By.xpath("//div[@class='leftNavigationLeftContainer expandDiv']//li/a/span[2]"));
		builder.moveToElement(mens).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='colDataInnerBlk']/p/a/span[text()='Sports Shoes'])[1]")).click();
		
		String text = driver.findElement(By.xpath("//div[text()='Sports Shoes for Men']/following::div")).getText();
		System.out.println("Sports Shoe for Men Count is : "+text);
		
		String pageTitle = driver.getTitle();
		if(pageTitle.contains("Sports Shoes For Men"))
		{
			System.out.println("Testcase Pass the title is : "+pageTitle);
		}
		else
		{
			System.err.println("Testcase Fail");
		}

	}

}
