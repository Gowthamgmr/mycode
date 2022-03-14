package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String currentwindow = driver.getWindowHandle();
		
		driver.findElement(By.id("home")).click();
		
		 Set<String> parentwindow = driver.getWindowHandles();
		 List<String> childwindow=new ArrayList<String>(parentwindow);
		 driver.switchTo().window(childwindow.get(1));
		 
		 driver.manage().window().maximize();
			
		//	driver.switchTo().window(Parentwindow);
		
		
		
		
		

	}

}
