package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditField {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("email")).sendKeys("gowtham21j2000@gmail.com");
		System.out.println("The default text is:"+driver.findElement(By.name("username")).getAttribute("value"));
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();
		System.out.println("Print false if the textbox is disabled:"+driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).isEnabled());
		
	}    		
}	

   
            
            
            
           
            
            
	

