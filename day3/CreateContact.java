package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[@class='top']//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Gowtham");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("R");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Gowtham");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("Ramaswamy");
		//driver.findElement(By.xpath("('//input[@id='createContactForm_birthDate']"))").sendKeys("");
		driver.findElement(By.xpath("//input[@name='primaryPhoneCountryCode']")).clear();
		//driver.findElement(By.xpath("//input[@id='createContactForm_birthDate']").clear();
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Computerscience Engineering ");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Hii.. Baby");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryPhoneCountryCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryPhoneNumber']")).sendKeys("7305557351");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("gowtham21j2000@gmail.com");
		driver.findElement(By.xpath("//input[@id='generalToNameField']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='createContactForm_generalAddress1']")).sendKeys("chettiyarpatti");
		driver.findElement(By.xpath("//input[@id='createContactForm_generalCity']")).sendKeys("Dhalavaipuram");
		driver.findElement(By.xpath("//input[@name='generalPostalCode']")).sendKeys("626188");
		WebElement DropDown3=driver.findElement(By.xpath("//select[@id='createContactForm_generalCountryGeoId']"));
		Select value1=new Select(DropDown3);
		value1.selectByValue("IND");
        driver.findElement(By.className("smallSubmit")).click();
	    driver.findElement(By.xpath("//a[text()='Edit']")).click();
	    driver.findElement(By.className("smallSubmit")).click();
	   
		String title1=driver.getTitle();
		String title2="View Contact | opentaps CRM";
	    if (title1.equals(title2)) {
			System.out.println("Testcase Pass");
		}else {
			System.err.println("Testcase Fail");
		}
		driver.close();
	
		
	}

}
