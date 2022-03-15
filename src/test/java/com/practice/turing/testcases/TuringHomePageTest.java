package com.practice.turing.testcases;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.practice.turing.pages.TuringHomePage;

import com.practice.turing.pages.TuringLoginPage;
import com.practise.turing.base.TuringParentClass;



public class TuringHomePageTest extends TuringParentClass {
	
	TuringLoginPage turingLoginPage;
	TuringHomePage  turingHomePage;
	
	

	
	public  TuringHomePageTest(){
		super();
	}
		@BeforeMethod
		public void setup() throws Throwable{
			launch();
			turingLoginPage=new TuringLoginPage();
			turingHomePage= new TuringHomePage();
			turingLoginPage.login(prop.getProperty("username"),prop.getProperty("password"));}
		
		@Test(priority=1)
		    public void clickOnCustomerIndTest(){
			turingHomePage.clickOnCustomerInd();
		}
		@AfterMethod
		public void teardown(){
			driver.quit();
		}

}
