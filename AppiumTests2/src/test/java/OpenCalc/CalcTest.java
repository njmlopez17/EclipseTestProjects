package OpenCalc;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalcTest {

	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		
		try {
			openCalculator();
		} catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	public static void openCalculator() throws Exception {
		
		// Set up desired capabilities and pass the Android app-activity and app-package to Appium
			DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability("deviceName", "Samsung S20 FE");
				cap.setCapability("udid", "RFCN90TZ4ER");
				cap.setCapability("platformName", "Android");
				cap.setCapability("automationName", "UiAutomator1");
				cap.setCapability("platformVersion", "10");
		// This package name of your app (you can get it from apk info app)
				cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		// This is Launcher activity of your app (you can get it from apk info app)		
				cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		// It will launch the Calculator app in Android Device using the configurations specified in Desired Capabilities
				URL url = new URL ("http://127.0.0.1:4723/wd/hub");
				driver = new AppiumDriver<MobileElement> (url, cap);	

// Calculator app test run
	//MobileElement two = driver.findElementByName(by."");
	//WebElement two = driver.findElement(By.className("android.widget.Button"));
	//MobileElement two = driver.findElement(By.xpath("//android.widget.Button[contains(@bounds, '3')]"));
	//WebElement two = driver.findElement(By.xpath("android.widget.Button[contains(@index,'3')]"));
	//MobileElement two = driver.findElement(By.xpath("//android.widget.Button[contains(@index,'13')]"));
	//MobileElement two = driver.findElementByXPath("//android.widget.Button[contains(@index,'13')]");
	//MobileElement two = driver.findElement(By.xpath("//android.widget.Button[contains(@index='13')][1]"));
	//MobileElement two = driver.findElement(By.xpath("//*[@class='android.widget.Button'] and [@bounds='[302,1774][524,1959] and [@index='13']']"));
	//two.click();
	
	MobileElement unit_disp = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_handle_btn_converter"));
	unit_disp.click();
	MobileElement unit_disp_back = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/converter_btn_back"));
	unit_disp_back.click();

//Indicator that Calculator is about to open..
	System.out.println("Application started...");
// Displaying output and indicates successful run...
	System.out.println("BUTTON CLICKED >> " + unit_disp);
	System.out.println("BUTTON CLICKED >> " + unit_disp_back);
	System.out.println("Done and Done!");
		
	}
	
}
