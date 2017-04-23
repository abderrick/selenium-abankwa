package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MercuryRegisterWithLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int x=0;x<5;)
			
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		WebElement element = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		element.click();
		if (x==0){
		driver.findElement(By.name("firstName")).sendKeys("Reggie");
		driver.findElement(By.name("lastName")).sendKeys("Osei");
		driver.findElement(By.name("register")).click();
		driver.close();
		}
		else if (x==1)
		{
			driver.findElement(By.name("firstName")).sendKeys("Kouphi");
			driver.findElement(By.name("lastName")).sendKeys("Dumbchamambe");
		}
		driver.findElement(By.name("register")).click();
		driver.close();
		x=x+1;34


		}
		
		

	}

}
