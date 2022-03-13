package testcasePakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import driverPakage.BaseDriver;

public class TestcaseLocator001 extends BaseDriver {
	String appUrl = "https://rahulshettyacademy.com/locatorspractice/";
	@Test
	public void LocatorSetup () throws InterruptedException  {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h1[contains(text(),'Sign in')]"));
		
		// username and pw input
		driver.findElement(By.id("inputUsername")).sendKeys("Masud Parvez");
		driver.findElement(By.name("inputPassword")).sendKeys("123456");
		
		// check box marking
		driver.findElement(By.id("chkboxOne")).click();	
		driver.findElement(By.id("chkboxTwo")).click();	
		
		// click sign in button
		driver.findElement(By.className("signInBtn")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		Thread.sleep(2000);
		//get error message while pw does not match.
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();
		Thread.sleep(2000);
		////a[contains(text(),'Forgot your password?')]
	}
	private WebElement findElement(By cssSelector) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

