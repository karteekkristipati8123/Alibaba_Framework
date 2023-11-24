package com.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileReader  fr;
	public static FileReader  fr1;
	
	@BeforeTest
	public static void setup() throws InterruptedException, IOException {
		FileReader fr= new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\config.properties");
		FileReader fr1= new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\locators.properties");
		prop.load(fr);
		loc.load(fr1);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARTHIK REDDY\\eclipse-workspace\\Alibaba_Framework\\drivers\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		op.setBinary("C:\\Users\\KARTHIK REDDY\\Downloads\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		Thread.sleep(5000);

	}
	
//	@AfterTest
//	public void teardown() {
//		driver.close();
//	}
}
