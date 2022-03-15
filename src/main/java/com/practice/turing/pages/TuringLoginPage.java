package com.practice.turing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practise.turing.base.TuringParentClass;

public class TuringLoginPage extends TuringParentClass {
	
	@FindBy(id="id_username")
	WebElement Employeecode;
	
	@FindBy(id="id_search_employee")
	WebElement verify;
	
	@FindBy(xpath="//input[@id='id_password']")
	WebElement Password;
	
	@FindBy(xpath="//button[@id='id_submit']")
	WebElement loginBtn;
	@FindBy(xpath="//p[contains(text(),'RAJKOT PEOPLES CO OPERATIVE BANK LTD')]")
	WebElement verifybankname;
			
	
	public   TuringLoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public  void login(String empcode,String pw) throws Throwable{
		Employeecode.sendKeys(empcode);
		verify.click();
		Thread.sleep(2000);
		Password.sendKeys(pw);
		Thread.sleep(2000);
		loginBtn.click();
	
	
	
	}
}
