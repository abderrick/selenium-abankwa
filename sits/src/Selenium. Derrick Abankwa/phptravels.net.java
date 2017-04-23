package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class usps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Open firefox driver
		WebDriver driver = new FirefoxDriver();
		driver.get("http://phptravels.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Derrick");
		driver.findElement(By.name("lastname")).sendKeys("Abankwa");
		driver.findElement(By.name("phone")).sendKeys("0208112742");
		driver.findElement(By.name("email")).sendKeys("1234@gmail.com");
		driver.findElement(By.name("password")).sendKeys("1234567");
		driver.findElement(By.name("confirmpassword")).sendKeys("1234567");
		
		driver.findElement(By.xpath("html/body/section/div/div/div/div/div[2]/div/form/div[9]/button")).click();
		
		
		
	}

}
