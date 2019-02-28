package Retailer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjectRepository.HomePage;

public class MarketPage extends HomePage {
	
	public MarketPage(WebDriver driver)
	{ 	
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
