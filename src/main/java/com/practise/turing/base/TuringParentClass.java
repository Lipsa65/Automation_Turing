package com.practise.turing.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TuringParentClass {
	
	 public static WebDriver driver;
	 public static Properties prop;
	 
	 public static void launch() throws Throwable {
			
			
			//ResourceBundle rb= ResourceBundle.getBundle("config");
			prop=new Properties();
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\practice\\turing\\config\\turingconfig.properties");
			prop.load(fis);
			WebDriverManager.chromedriver().setup();
			ChromeOptions opt=new ChromeOptions();
			opt.setExperimentalOption("excludeSwitches", Arrays.asList("enabled-automation"));
			Thread.sleep(3000);
			 driver=new ChromeDriver(opt);
			 driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			driver.get(prop.getProperty("url"));
			String URL	=driver.getCurrentUrl();
			System.out.println("url is   "+URL);

}
	 
	 public   void TakeScreenshots() throws Throwable {
			//take screenshot and store it in a file format
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//now copy the file to the desired location with the copyfile method.
			FileUtils.copyFile(file, new File("C:\\Users\\lipsas\\eclipse-workspace\\AutomationTuring\\Screenshots"+"failshots_"+this.getClass().getName()+"--"+".jpg"));
			System.out.println("screnshot taken");
}
}