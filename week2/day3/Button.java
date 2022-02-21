package week2.day3;

import javax.print.attribute.SetOfIntegerSyntax;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
 
	 public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver= new ChromeDriver();
	 driver.get("http://www.leafground.com/");
	 driver.manage().window().maximize();
	 driver.findElement(By.linkText("Button")).click();
	 driver.findElement(By.id("home")).click();
	 String text="TestLeaf - Selenium Playground";
	 String title=driver.getTitle();
	 if(text.equals(title)) {
		 System.out.println("Home page is Displayed");
		 }
	 else {
		 System.out.println("Home page id not Displayed");
	 }
	 driver.findElement(By.linkText("Button")).click();
	 Point location=driver.findElement(By.id("position")).getLocation();
	 int x=location.getX();
	 int y=location.getY();
	 System.out.println(x);
	 System.out.println(y);
	 String cssvalue=driver.findElement(By.id("color")).getCssValue("background-color");
	 System.out.println(cssvalue);
	 
	}

}
