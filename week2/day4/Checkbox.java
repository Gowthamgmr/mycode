package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//div/input[@type='checkbox'])[1]")).click();
		boolean selected = driver.findElement(By.xpath("//input[@checked]")).isSelected();
		if(selected==true)
		{
			System.out.println("The box is selected");
		}
		driver.findElement(By.xpath("(//input[@checked])[2]")).click();
		driver.findElement(By.xpath("((//div[@class='example'])[4]/div/input)[1]")).click();
		driver.findElement(By.xpath("((//div[@class='example'])[4]/div/input)[2]")).click();
		driver.findElement(By.xpath("((//div[@class='example'])[4]/div/input)[3]")).click();
		driver.findElement(By.xpath("((//div[@class='example'])[4]/div/input)[4]")).click();
		driver.findElement(By.xpath("((//div[@class='example'])[4]/div/input)[5]")).click();

	}

}
