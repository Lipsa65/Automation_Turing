package com.practice.turing.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.practice.turing.pages.TuringLoginPage;
import com.practise.turing.base.TuringParentClass;

public  class TuringLoginPageTest extends TuringParentClass {
	
	TuringLoginPage loginPage;
	//HomePage homepage;
	
	
public TuringLoginPageTest(){
		super();
			}
       @BeforeClass
          public void setup() throws Throwable{
	       launch();
	        loginPage=new TuringLoginPage();}

       @Test(priority=1,groups= {"sanity"})
       	public void LoginTest() throws Throwable{
    	   loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
       } 
       
       //priority an have integer value-positive zero and negetive
    	   @Test(priority=1,groups= {"sanity","smoke"})
    	   public void verifyBankName() throws Throwable {
    		   Thread.sleep(3000);
    		   
    		   	WebElement verifybankname =driver.findElement(By.xpath("//p[contains(text(),'RAJKOT PEOPLES CO OPERATIVE BANK LTD')])]"));
    		   	
    		   System.out.println(verifybankname.getText());	
    		   	Assert.assertEquals(verifybankname.getText(),"RAJKOT PEOPLES CO OPERATIVE BANK LTD");
    		   	System.out.println("Test ispassed");
    		   
    		   }
	

	@AfterClass
		public void teardown(){
		driver.quit();
}

}
