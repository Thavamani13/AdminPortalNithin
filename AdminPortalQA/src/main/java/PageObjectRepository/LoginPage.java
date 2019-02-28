package PageObjectRepository;
mport org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	protected WebDriver driver;
	
	@FindBy(xpath="")
	private WebElement Usename;
	
	@FindBy(linkText="")
	private WebElement Password;
	
	@FindBy(id="logoutLink")
	private WebElement LoginButton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
