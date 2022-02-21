package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.partialLinkText("SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.partialLinkText("Find")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Gowtham");
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Ramaswamy");
			driver.findElement(By.xpath("//td[@class='x-btn-center']/em/button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			
			WebElement findElement = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
			String text = findElement.getText();
			System.out.println(text);
			findElement.click();
			
			String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
			System.out.println(firstName);
			driver.findElement(By.linkText("Duplicate Lead")).click();
			if(driver.getTitle().contains("Duplicate Lead"))
			{
				System.out.println("Testcase pass The title is :"+driver.getTitle());
			}
			else
			{
				System.err.println("Testcase fail");
			}
			
			driver.findElement(By.className("smallSubmit")).click();
			String firstCaptureName = driver.findElement(By.xpath("//ul[@class='navHistory']/li/a")).getTagName();
			if(firstName.contains(firstName))
			{
				System.out.println("Testcase Pass the name is:"+firstName);
			}
			else
			{
				System.err.println("Testcase Fail");
			}

	}

}
