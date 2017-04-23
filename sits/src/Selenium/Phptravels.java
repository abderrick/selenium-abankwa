package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Phptravels {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://phptravels.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Derrick");
		driver.findElement(By.name("lastname")).sendKeys("Abankwa");
		driver.findElement(By.name("phone")).sendKeys("123456789");
		driver.findElement(By.name("email")).sendKeys("juhim@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456789");
		driver.findElement(By.name("confirmpassword")).sendKeys("123456789");
		
		
				
	}

}
