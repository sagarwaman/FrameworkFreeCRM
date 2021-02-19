package com.common.utilities;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.common.method.BaseClass;

public class DriverManager extends BaseClass{
	
	private static ThreadLocal<WebDriver> webdriver = new ThreadLocal<WebDriver>();
	
	public static synchronized void setdriver(WebDriver driver1) {
		webdriver.set(driver1);
	}
	
	public static synchronized WebDriver getdriver() {
		return webdriver.get();
	}
	
	@SuppressWarnings("deprecation")
	public static void initiateWebDriver(String Browser) {
		if(Browser.equalsIgnoreCase("chrome")) {
			DesiredCapabilities capability =  DesiredCapabilities.chrome();
			capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("incognito");
			options.addArguments("disable-extensions");
			capability.setCapability(ChromeOptions.CAPABILITY, options);
			try{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\com.application.chromedriver\\chromedriver.exe");
			   System.out.println(System.getProperty("user.dir")+"\\src\\test\\resources\\com.application.chromedriver");
				setdriver(new ChromeDriver(capability));
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Session is not created");
				e.printStackTrace();
			}
		}
		
		if(webdriver == null) {
			System.out.println("Driver is not initiaized properly");
		}	
	}
	
	public static void stopdriver() {
		getdriver().close();
		getdriver().quit();
		System.out.println("Browser is closed successfully.");
	}

}
