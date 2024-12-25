package package_amazon.Project_Amazon_new;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TC1_Addtocart {
	@Test
	public void login_amazon() throws InterruptedException
	{
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://amazon.in");
	
	Homepage hp=new Homepage(driver);
	hp.search(driver);
	
	Addtocartpage ac=new Addtocartpage(driver);

	ac.add_tocart(driver);
	
ac.proceedtocheckout(driver);
Login_toamazon la=new Login_toamazon(driver);
la.login(driver);
Set<String> windowHandles = driver.getWindowHandles();
Iterator<String> iterator = windowHandles.iterator();
String parentid = iterator.next();
String childid = iterator.next();
driver.switchTo().window(childid);
}
	
	
	}
	