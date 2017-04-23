package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uspsloc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		//open web browser
		driver.get("https://usps.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("html/body/div[2]/div[2]/div/nav/ol/li[2]/a/span")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[6]/div/div[1]/div[3]/div[3]/a")).click();
		
		
	}

}
