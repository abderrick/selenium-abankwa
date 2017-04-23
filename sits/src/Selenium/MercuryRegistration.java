package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		System.out.println("Mercury Website Opened");
		System.out.println("Title of the page is:"+driver.getTitle());
		//Click on "REGISTER" link
		WebElement element = driver.findElement(By.linkText("REGISTER"));
		element.click(); 
		//Enter First Name
		WebElement element1 = driver.findElement(By.name("firstName"));
		element1.sendKeys("Reggie");
		WebElement element2 = driver.findElement(By.name("lastName"));
		element2.sendKeys("Osei");
		//WebElement element3 = driver.findElement(By.name("phone")):
		//element3.sendKeys("2024601602")
		driver.findElement(By.name("phone")).sendKeys("2024601602");
		driver.findElement(By.name("userName")).sendKeys("reggieosei@me.com");
		driver.findElement(By.name("address1")).sendKeys("900 California Street");
		driver.findElement(By.name("city")).sendKeys("Los Angeles");
		driver.findElement(By.name("state")).sendKeys("California");
		driver.findElement(By.name("postalCode")).sendKeys("90012");
		driver.findElement(By.name("email")).sendKeys("reggieosei@me.com");
		driver.findElement(By.name("password")).sendKeys("SuckDeez");
		driver.findElement(By.name("confirmPassword")).sendKeys("SuckDeez");
		driver.findElement(By.name("register")).click();






			
				
		

		
		
		
		
		
		
		
	

	}

}
