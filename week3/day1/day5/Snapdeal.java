package week3.day5;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(options);
		options.addArguments("--disable-notifications");
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions build=new Actions(driver);
		WebElement mensFashion = driver.findElement(By.xpath("(//ul[@class='nav smallNav']//following::span)[2]"));
		build.moveToElement(mensFashion).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		String shoesCount = driver.findElement(By.xpath("//div[text()='Sports Shoes for Men']/following-sibling::div")).getText();
		System.out.println("Sports shoe for men Count is : "+shoesCount);
		
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		Thread.sleep(2000);
		
	    java.util.List<WebElement> product = driver.findElements(By.xpath("//div[@id='products']//span[@class='lfloat product-price']"));
		int size = product.size();
		System.out.println(size);
		
			WebElement sortPrice = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[1]"));
			String prize1 = sortPrice.getText();
			//Thread.sleep(2000);
			String replaceAll = prize1.replaceAll("\\D", "");
			//Thread.sleep(2000);
			//System.out.println(replaceAll);
			int product1 = Integer.parseInt(replaceAll);
			
			for (int i = 2; i < size; i++)
			{
				WebElement sortPrice1 = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])["+i+"]"));
				String prize2 = sortPrice1.getText();
				String replaceAll1 = prize2.replaceAll("\\D", "");
				
				int product2 = Integer.parseInt(replaceAll1);
				//Thread.sleep(2000);
				
				if(product2  >= product1)
				{
					
				}
				else
				{
					System.err.println("Testcase Fail : Not in the selected order");
				}
				
			}
			System.out.println("The shoes are displayed in a selected order.");
		
		driver.findElement(By.xpath("//div[@class='price-input']//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//div[@class='price-input']//input[@name='fromVal']")).sendKeys("900");
		driver.findElement(By.xpath("//div[@class='price-input']//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//div[@class='price-input']//input[@name='toVal']")).sendKeys("1200");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='sdCheckbox filters-list '] [5])[1]")).click();
		
		WebElement element6 = driver.findElement(By.xpath("(//div[@class='product-tuple-image '])[1]"));
		Actions click2= new Actions(driver);
		click2.moveToElement(element6).perform();
		Thread.sleep(2000);
		
		WebElement element7 = driver.findElement(By.partialLinkText("Red Tape Walking  Navy Training"));
		Actions click3=new Actions(driver);
		click3.moveToElement(element7).perform();
		
		driver.findElement(By.xpath("(//div[@class='center quick-view-bar  btn btn-theme-secondary  '])[1]")).click();
		String text5 = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("The discount percemtage is :"+text5);
		
		//snapchat 
		Thread.sleep(2000);
		File snap=driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./Images/shoeimage.png");
		FileUtils.copyFile(snap,des);
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}













/*
 * 1. Launch https://www.snapdeal.com/ 
 * 2. Go to Mens Fashion 
 * 3. Go to Sports
 * Shoes 
 * 4. Get the count of the sports shoes 
 * 5. Click Training shoes 
 * 6. Sort by
 * Low to High 
 * 7. Check if the items displayed are sorted correctly 
 * 8.Select the
 * price range (900-1200) 
 * 9.Filter with color Navy 
 * 10 verify the all applied
 * filters 
 * 11. Mouse Hover on first resulting Training shoes 
 * 12. click QuickView
 * button 
 * 13. Print the cost and the discount percentage 
 * 14. Take the snapshot
 * of the shoes. 
 * 15. Close the current window 16. Close the main window
 */
