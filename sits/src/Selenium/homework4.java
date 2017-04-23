package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//the statement below launches firefox browser
		WebDriver Driver = new FirefoxDriver ();
		//the statement below launches fda homepage
		Driver.get("http://www.fda.gov/");
		//the below declares the variable "expectedTitle" as a string
		String expectedTitle;
		expectedTitle="U S Food and Drug Administration Home Page";
		String actualTitle;
		actualTitle=Driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle))
		{
		System.out.println("Test Case Passed");
		}
		else
		{
		System.out.println("Test Case Failed");
		}
		Driver.quit();
		
	}
}

