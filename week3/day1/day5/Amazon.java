package week3.day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get(" https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		String newtext = text.replaceAll("\\D", "");
		System.out.println("The cost of the first product:"+newtext);
		
		String text2 = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("The number of customer Ratings:"+text2);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		String text3 = driver.findElement(By.xpath("(//span/a[@class='a-link-normal'])[1]")).getText();
		System.out.println("The Star Rating Percentage for 5 star is:"+text3);
		
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		//window handling
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		ArrayList<String> value =new ArrayList<String>(windowHandles);
		driver.switchTo().window(value.get(1));
		String currentUrl = driver.getCurrentUrl();
		System.out.println("CurrentUrl : "+currentUrl);
		
		driver.findElement(By.xpath("//img[@id='landingImage']")).click();
		Thread.sleep(2000);
		
		//screenshot
		File snap=driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./amazon/snap.png");
		FileUtils.copyFile(snap, des);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-close'])[1]")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		
		String text4 = driver.findElement(By.xpath("(//div[@class='a-column a-span11 a-text-left a-spacing-top-large']//span)[3]")).getText();
		String amount = text4.replaceAll("\\D", "");
		System.out.println("The subtotal is:"+amount);
		
		if(amount.contains(newtext))
		{
			System.out.println("Testcase Pass");
			Thread.sleep(2000);
			driver.quit();
		}
		else
		{
			System.err.println("Testcase Fail");
		}			
	

	}

}
