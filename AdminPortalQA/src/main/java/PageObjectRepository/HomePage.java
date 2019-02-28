package PageObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageObjectRepository.Utilities.CommonActions;

public class HomePage extends CommonActions {
				
		public HomePage(WebDriver driver)
		{
			super(driver);
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}

}

