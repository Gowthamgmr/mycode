package week3.day5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(options);
		options.addArguments("--disable-notifications");
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions build=new Actions(driver);
		WebElement brand = driver.findElement(By.xpath("//ul[@class='HeaderNav css-f7ogli']/li/a[text()='brands']"));
		build.moveToElement(brand).perform();
		
		driver.findElement(By.xpath("//div[@class='brandSearchMain']/input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
		driver.findElement(By.xpath("//div[@id='scroller-container']//a[1]")).click();
		
		String title = driver.getTitle();
		if(title.contains("L'Oreal Paris"))
		{
			System.out.println("Testcase Pass, The Title is: "+title);
		}
		else
		{
			System.err.println("TestCase Fail");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@id='filters-listing']//div)[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='customer top rated']/following::div")).click();
		driver.findElement(By.xpath("//div[@class='sidebar__inner']//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Category']/following::span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Category']/following::span[text()='Hair Care']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Category']/following::span[text()='Shampoo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		String filter = driver.findElement(By.xpath("//span[@class='filter-value'][1]")).getText();
		if(filter.contains("Shampoo"))
		{
			System.out.println("The Filter Shampoo is selected");
		}
		else
		{
			System.err.println("Shampoo is not selected");
		}
		driver.findElement(By.xpath("//div[@id='product-list-wrap']//following::img[1]")).click();
		//driver.findElement(By.xpath("(//div[@class='css-1rd7vky'])[1]")).click();
		Thread.sleep(500);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		ArrayList<String> value =new ArrayList<String>(windowHandles);
		driver.switchTo().window(value.get(1));
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);		
		
		WebElement size = driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select dropDown1=new Select(size);
		dropDown1.selectByVisibleText("175ml");
		
		String mrp = driver.findElement(By.xpath("//span[text()='MRP:']/span")).getText();
		System.out.println("MRP of the product: "+mrp);
		
		driver.findElement(By.xpath("//button/span[text()='ADD TO BAG']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Account']//following::button")).click();
		driver.switchTo().frame(0);
		String grandTotal = driver.findElement(By.xpath("(//div[@class='first-col'])/div[@class='value']")).getText();
		System.out.println("The Grand Total Amount is : "+grandTotal);
		
		driver.findElement(By.xpath("//span[text()='PROCEED']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[text()='Grand Total']//following::div")).getText();
		if(grandTotal.contains(text))
		{
			System.out.println("TestCase Pass");
			driver.quit();
		}
		else
		{
			System.err.println("TestCase Fail");
		}

	}

}
