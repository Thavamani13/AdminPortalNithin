package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjectRepository.LoginPage;

public class CommonActions extends LoginPage {

	public CommonActions(WebDriver driver)
	{ 	
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


}
