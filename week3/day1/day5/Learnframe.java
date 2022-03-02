package week3.day5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnframe {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(0);
		WebElement Click1=driver.findElement(By.id("Click"));
		Click1.click();
		String name=Click1.getText();
		System.out.println(name);
		driver.switchTo().defaultContent();
       
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement Click2 = driver.findElement(By.id("Click1"));
		Click2.click();
		String name1=Click2.getText();
		System.out.println(name1);
		driver.switchTo().defaultContent();
		
		List <WebElement> find = driver.findElements(By.tagName("iframe"));
		int size = find.size();
		System.out.println("the number of frames is:"+size);
		
		
		File source=driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshot/leafframe1.png");
		FileUtils.copyFile(source,des);
		
		
		
		}

}
