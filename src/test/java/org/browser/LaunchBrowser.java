package org.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91979\\Downloads\\chromedriver_win32\\chromedriver");
	}
	WebDriver driver = new ChromeDriver();

}
