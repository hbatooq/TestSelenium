package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Slowtestpage {

	public static void main(String[] args) {
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
		    driver.get("https://qatestid12.wixsite.com/qaspecialist");
		    WebDriverWait wait2 = new WebDriverWait(driver,50);		    
		    WebElement contact,firstF1, email, subject, message, login;
		    System.out.println("Page is here");
			contact = driver.findElement(By.xpath("//*[@id=\"comp-ifgtula74label\"]"));
			wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"comp-ifgtula74label\"]")));
			contact.click();
			System.out.println("Contact is clicked");
			
			firstF1 = driver.findElement(By.xpath("//*[@id=\"comp-jhrgftz1input\"]"));	
			firstF1.sendKeys("Hina Hasan");
			
			email = driver.findElement(By.xpath("//*[@id=\"comp-jhrggrufinput\"]"));
			email.sendKeys("hinahasan_iu@yahoo.com");
			
			subject = driver.findElement(By.xpath("//*[@id=\"comp-jhrgh32ainput\"]"));
			subject.sendKeys("hinahasan_iu@yahoo.com");
			
			message = driver.findElement(By.xpath("//*[@id=\"comp-jhrgk2pstextarea\"]"));
			message.sendKeys("this is message");
			
			login = driver.findElement(By.xpath("//*[@id=\"comp-jhrgemmllink\"]"));
			login.click();
			
			String title = "Thanks"; 
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

	}

}
