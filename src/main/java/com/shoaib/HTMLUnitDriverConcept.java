package com.shoaib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * 
 * @author ShoaibHannure
 *
 */
public class HTMLUnitDriverConcept {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\SHOAIB HANNURE\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver(); //Launch Chrome

		// htmlunitdriver is not available in Selenium 3.x version
		// htmlunitdriver-- to use this concept, we have to download
		// htmlunitdriver dependency/JAR File

		// Advantages:-
		// 1. Testing is happening behind the scene-- no browser is launched.
		// 2. Very Fast--execution of test cases very fast--performance of the
		// script
		// 3. Not suitable for Action Class--user action, mouse movement, double
		// click, drag & drop
		// 4. Ghost Driver-- Headless Browser
		// htmlunit driver--Java
		// PhantomJS--Javascript

		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // Delete all cookies

		// Dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://github.com/");
		System.out.println("Title of Page is======" + driver.getTitle());


		driver.quit();
		System.out.println("Headless Browser Testing is completed");
	}

}
