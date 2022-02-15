package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchbrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");
		//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Zoho");
		//String text=driver.findElement("h2").gettext();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gowtham");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramaswamy");
		driver.findElement(By.className("smallSubmit")).click();
		 String.title=driver.getTitle();
		 String.title1="View lead | opentab CRM";
		 if(title.equals(title1)) {
			 System.out.println("test case pass");
		 }else {
			 System.err.println("test case fail");
		 }
		 
		
		
		//String title=driver.getTitle();
		//System.out.println(title);
		//driver.close()
		
		
		

	}

}
