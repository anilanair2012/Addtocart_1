package package_amazon.Project_Amazon_new;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath="//span[@class='nav-line-2 ']")WebElement accountslists;
	@FindBy(xpath="//span[.='Sign in']") WebElement signin;
	@FindBy(id="ap_email")WebElement username;
	@FindBy(id="continue")WebElement continuebutton;
	@FindBy(name="password")WebElement pwd;
	@FindBy(id="signInSubmit")WebElement sign;
@FindBy(id="twotabsearchtextbox")WebElement search;
@FindBy(xpath="//div[@id='nav-cart-count-container']")WebElement removecart;
@FindBy(xpath="(//span[@data-action='delete'])[1]")WebElement delete;
	public void login(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountslists).perform();
		signin.click();
		username.sendKeys("anilanair2012@gmail.com");
		continuebutton.click();
		pwd.sendKeys("Pournami@123");
		sign.click();
	}
	public void search(WebDriver driver)
	{
		search.sendKeys("shoes"+Keys.ENTER);
	}
	
	/*public void remove(WebDriver driver)
	{
		removecart.click();
	}
	public void deletion(WebDriver driver)
	{
		delete.click();
	}*/

	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
