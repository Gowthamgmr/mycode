package week3.day3;

import java.awt.Dimension;
import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ERail {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("Madurai Jn",Keys.TAB);
		
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MAS",Keys.TAB);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		
		java.util.List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		int rowCount = findElements.size();
		System.out.println(rowCount);
		
		for (int i = 1; i <= rowCount; i++) {
			String trainNo = driver.findElement(By.xpath("//div[@id='divTrainsList']//tr["+i+"]/td[1]")).getText();	
			String trainName = driver.findElement(By.xpath("//div[@id='divTrainsList']//tr["+i+"]/td[2]")).getText();
			System.out.println("Train No : "+trainNo+" "+"Train Name : "+trainName);
             }
	}		
}
