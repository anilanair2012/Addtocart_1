package package_amazon.Project_Amazon_new;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_toamazon {
	static WebDriver driver;

@FindBy(id="ap_email")WebElement username;
@FindBy(id="continue")WebElement continuebutton;
@FindBy(name="password")WebElement pwd;
@FindBy(id="signInSubmit")WebElement sign;


public void login(WebDriver driver)
{
	
	username.sendKeys("anilanair2012@gmail.com");
	continuebutton.click();
	pwd.sendKeys("Pournami@123");
	sign.click();
}

public Login_toamazon(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
