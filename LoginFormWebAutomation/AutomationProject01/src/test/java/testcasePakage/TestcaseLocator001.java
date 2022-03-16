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
		Thread.sleep(1000);
		//get error message while pw does not match.
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();
	    // //a[contains(text(),'Forgot your password?')]
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Masud");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("mmparvez96@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("01822074022");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		driver.findElement(By.xpath("//div[@class ='forgot-pwd-btn-conainer']/button[1]")).click();
		// driver.findElement(By.xpath("//button[contains(text(),'Go to Login')]")).click();
		
		//pw :rahulshettyacademy
		
		// finally login with valid pw
		driver.findElement(By.xpath("//form[@class ='form']/input[1]")).sendKeys("Masud Parvez");
		driver.findElement(By.xpath("//form[@class ='form']/input[2]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();	
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();	
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(4000);
		
	}
	private WebElement findElement(By cssSelector) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

