package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.Base;

public class LoginPage extends Base {

	public void testlogin() throws InterruptedException {
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='J_SC_header']/header/div[1]/div[5]/div[2]/div[1]/div[2]/span[1]/a")).click();
		//*[@id='J_SC_header']/header/div[1]/div[5]/div[2]/div[1]/div[2]/span[1]/a
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath(loc.getProperty("account"))).sendKeys(prop.getProperty("account_field"));
			Thread.sleep(3000);
			driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys(prop.getProperty("password_field"));
			Thread.sleep(3000);
			
			//ac.dragAndDropBy(slider, 0, 100).build().perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath(loc.getProperty("signin"))).click();
			Thread.sleep(4000);
			WebElement slider = driver.findElement(By.xpath("//*[@id=\"nc_1_n1z\"]"));
			Actions  ac = new Actions(driver);
			ac.clickAndHold(slider).moveByOffset(100, 0).release().perform();

		} catch (ElementNotInteractableException e) {
			System.out.println("Element not interactable: " + e.getMessage());
		}
//		driver.findElement(By.xpath(loc.getProperty("account"))).sendKeys(prop.getProperty("account_field"));
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys(prop.getProperty("password_field"));
//		Thread.sleep(3000);
//		
//		//ac.dragAndDropBy(slider, 0, 100).build().perform();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(loc.getProperty("signin"))).click();
//		Thread.sleep(4000);
//		WebElement slider = driver.findElement(By.xpath("//*[@id=\"nc_1_n1z\"]"));
//		Actions  ac = new Actions(driver);
//		ac.clickAndHold(slider).moveByOffset(0, 100).release().perform();

		
	}
}
