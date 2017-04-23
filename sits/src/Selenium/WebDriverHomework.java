package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.phptravels.net/");
		WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/ul/li[8]/a"));
		element.click();
		WebElement element1 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/ul/li[8]/ul/li[2]/a"));
		element1.click();
		driver.findElement(By.name("firstname")).sendKeys("Reggie");
		driver.findElement(By.name("lastname")).sendKeys("Osei");
		driver.findElement(By.name("phone")).sendKeys("2024601602");
		driver.findElement(By.name("email")).sendKeys("reggieosei@me.com");
		driver.findElement(By.name("password")).sendKeys("Reg123");
		driver.findElement(By.name("confirmpassword")).sendKeys("Reg123");
		
		 
		
		
			

	}

}
