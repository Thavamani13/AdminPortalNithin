package Retailer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PageObjectRepository.HomePage;

public class ParticipantPage extends HomePage {

	
		public ParticipantPage(WebDriver driver)
		{ 	
			super(driver);
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}

}
