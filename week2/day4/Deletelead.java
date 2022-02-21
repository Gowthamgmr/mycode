package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deletelead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[@class='top']//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]")).sendKeys("Gowtham");
        driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Ramaswamy");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(2000);
        String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[text()='12274']")).getText();
	    System.out.println(text);
	    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[text()='12274']")).click();
	    driver.findElement(By.linkText("Delete")).click();
	   
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.name("id")).sendKeys(text);
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    String text1= driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
	    System.out.println(text1);
	    driver.close();
        
        
        
        
	}

}
