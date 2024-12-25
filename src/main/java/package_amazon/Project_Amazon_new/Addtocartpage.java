package package_amazon.Project_Amazon_new;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartpage {
	@FindBy(xpath="//span[@class='nav-line-2 ']")WebElement accountslists;
	@FindBy(xpath="//span[.='Sign in']") WebElement signin;
	@FindBy(id="ap_email")WebElement username;
	@FindBy(id="continue")WebElement continuebutton;
	@FindBy(name="password")WebElement pwd;
	@FindBy(id="signInSubmit")WebElement sign;
	@FindBy(id="twotabsearchtextbox")WebElement search;
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")WebElement shoes;
	@FindBy(id="add-to-cart-button")WebElement add;
@FindBy(name="proceedToRetailCheckout")WebElement proceed;

	/*public void login(WebDriver driver)
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
	
	}*/
	public void add_tocart(WebDriver driver) throws InterruptedException
	{
		shoes.click();
		Set<String> bd = driver.getWindowHandles();
		Iterator<String> i1 = bd.iterator();
		String parentid = i1.next();
		String childid = i1.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);
		Thread.sleep(3000);
		add.click();
		//driver.switchTo().window(parentid);
	}
	public void proceedtocheckout(WebDriver driver)
	{
		proceed.click();
	}

	public Addtocartpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
