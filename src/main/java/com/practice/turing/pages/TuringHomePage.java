package com.practice.turing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practise.turing.base.TuringParentClass;

public class TuringHomePage extends TuringParentClass{
	
	@FindBy(xpath="//span[contains(text(),'Customer Creation (Individual)')]")
	WebElement customercreationindivisuallink;
	
	public TuringHomePage(){
		PageFactory.initElements(driver, this);}
	
	public void clickOnCustomerInd(){
		customercreationindivisuallink.click();
		
	
	}
	
	
	
	

	
	
}
