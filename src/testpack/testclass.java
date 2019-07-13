package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\web driver\\chromedriver.exe");
		  ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("disable-infobars");
			//options.addArguments("--incognito");
			//options.addArguments("--ignore-certificate-errors");
	       // options.addArguments("--disable-popup-blocking"); //for only browsers not for the application
			WebDriver driver = new ChromeDriver(options); 
		  //WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    
		    
		    
		    driver.get("https://demo.opencart.com/index.php?route=account/login");
		    WebElement username, password, login, menu, submenuLogout;
			username = driver.findElement(By.id("input-email"));
			username.sendKeys("mytc5@gmail.com");
			password = driver.findElement(By.name("password"));
			password.sendKeys("123456789");
			//login = driver.findElement(By.xpath("//input[@type='submit' and @class='btn btn-primary']"));
			login = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
			login.click();
			
			
			//******From Page text
			String title = "My Account"; 
			String actualpagetitle = "";
			actualpagetitle = driver.getTitle();
			System.out.println(actualpagetitle);
			
			if(actualpagetitle.contentEquals(title))
			{
				System.out.println("Test Passed!");
			}			
			else
			{
				System.out.println("Test Failed!");
			}
			
			// From Page url
			
			//String url = "";
			//url = driver.getCurrentUrl();
			//System.out.println(url);
			
			//if (actualpagetitle.contains("Account")){
	           // System.out.println("URL Test Passed!");
	      //  } else {
	          //  System.out.println("URL Test Failed");
	       // }
			
		//	driver.get("https://demo.opencart.com/index.php?route=account/logout");
			//driver.quit();
			
			
			
			//menu = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
			//menu.click();
			//submenuLogout = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
			//submenuLogout.click();
			
			
			//Place order
			
			driver.get("https://demo.opencart.com/index.php?route=product/product&product_id=47&search=HP+LP3065");
			WebElement addcart, shoppingcart,checkout, continue1, continue2, continue3, continue4, terms, continue5,confirm;
			WebDriverWait wait2 = new WebDriverWait(driver,30);		
			addcart = driver.findElement(By.xpath("//*[@id=\"button-cart\"]"));
			addcart.click();
			// //*[@id="button-payment-method"]
			System.out.println(" Start ShoppingCart");
			shoppingcart = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"product-product\"]/div[1]/a[2]")));
			//shoppingcart= driver.findElement(By.xpath("By.xpath(\"//*[@id=\\\"product-product\\\"]/div[1]/a[2]\")));"));
			shoppingcart.click();
			Thread.sleep(2000);
			System.out.println(" Clicked ShoppingCart");
			
			Thread.sleep(2000);
			System.out.println(" Start Checkout");
			checkout = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")));
			checkout.click();
			System.out.println(" Clicked Checkout");
			
			Thread.sleep(5000);
			System.out.println(" Start Continue1");
			continue1 = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"button-payment-address\"]")));
			continue1.click();
			System.out.println(" Clicked Continue1");
			
			Thread.sleep(5000);
			System.out.println(" Start Continue2");
			continue2 = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"button-shipping-address\"]")));
			continue2.click();
			System.out.println(" Clicked Continue2");
			
			Thread.sleep(5000);
			WebElement openfilter  = driver.findElement(By.xpath("//*[@id=\"collapse-shipping-method\"]/div/p[4]/textarea"));
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView()", openfilter);			
			openfilter.click();
			
			Thread.sleep(2000);
			System.out.println(" Start Continue3");
			continue3 = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"button-shipping-method\"]")));
			continue3.click();
			System.out.println(" Clicked Continue3");
			
			
			Thread.sleep(5000);
			System.out.println(" Start Terms");
			terms = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")));
			terms.click();
			System.out.println(" Clicked Terms");
			
			Thread.sleep(5000);
			System.out.println(" Start Continue5");
			continue5 = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"button-payment-method\"]")));
			continue5.click();
			System.out.println(" Clicked Continue5");
			
			Thread.sleep(5000);
			////*[@id="button-confirm"]
			System.out.println(" Start Confirm");
			Thread.sleep(2000);
			confirm = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"button-confirm\"]")));
			confirm.click();
			System.out.println(" clicked Confirm");
			////*[@id="content"]/div[3]/div[2]/a
			
			Thread.sleep(5000);
			System.out.println(" Start Confirm");
			Thread.sleep(2000);
			checkout = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")));
			checkout.click();
			System.out.println(" clicked Confirm");
			
			
			
			
	}

}
