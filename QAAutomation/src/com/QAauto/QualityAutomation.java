package com.QAauto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QualityAutomation {
	
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Basics\\Projects\\Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}	
}
