package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CompareTitles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String expectedTitle;
		expectedTitle="Google";
		String actualTitle;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		actualTitle=driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test case passed");
		}
		else
		{
		System.out.println("Test Case Failed");
		}
	}
}


