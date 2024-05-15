package task19;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public Locators() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Indhu_ZenClass\\JavaPrograms\\eclipse-workspace\\chromedriver-win64\\chromedriver.exe");
	}
	WebDriver driver = new ChromeDriver();
	public void launchSite() {
		driver.navigate().to("https://www.guvi.in/register");
			
		//By ID
		driver.findElement(By.id("name"));
		driver.findElement(By.id("email"));
		driver.findElement(By.id("password"));
		driver.findElement(By.id("togglePassword"));
		driver.findElement(By.id("mobileNumber"));
		driver.findElement(By.id("signup-btn"));
		
		//By Class Name
		driver.findElement(By.className("login"));
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
		driver.switchTo().frame(frameElement);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.className("haAclf"))));
			
		driver.switchTo().parentFrame();
		
		//driver.findElement(By.className("password-err"));
		//driver.findElement(By.className("passToggle"));
		driver.findElement(By.className("iti__flag-container"));
		//driver.findElement(By.className("countrycode-left"));
		driver.findElement(By.className("logo"));
		
		//By tagname		
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		driver.findElements(By.tagName("label"));
		driver.findElements(By.tagName("input"));
		driver.findElements(By.tagName("img"));
		driver.findElements(By.tagName("small"));
		driver.findElements(By.tagName("a"));
		
		//By Xpath
		driver.findElement(By.xpath("//p/a"));
		
		WebElement frameElement1 = driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
		driver.switchTo().frame(frameElement1);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("container"))));	
		
		driver.switchTo().parentFrame();
			
		driver.findElement(By.xpath("//form/div/input[@id='name']"));
		driver.findElement(By.xpath("//form/div[1]/input[@class='form-control']"));
		driver.findElement(By.xpath("//form/div/input[@id='email']"));
		driver.findElement(By.xpath("//form/div[2]/input[@class='form-control']"));
		driver.findElement(By.xpath("//form/div/input[@id='password']"));
		driver.findElement(By.xpath("//input[contains(@class,'password-err')]"));	
		driver.findElement(By.xpath("//form/div[3]/input[contains(@class,'form-control')]"));
		driver.findElement(By.xpath("//span[contains(@class,'passToggle')]"));
		driver.findElement(By.xpath("//div//span[@id='togglePassword']"));
		driver.findElement(By.xpath("//input[contains(@class,'countrycode-left')]"));
		driver.findElement(By.xpath("//form/descendant::a[contains(@class,'signup-btn')][1]"));
		driver.findElement(By.xpath("//form/child::a[contains(@class,'signup-btn')]"));
		
		//By CSS Selector
		driver.findElement(By.cssSelector(".login"));
		WebElement frameElement2 = driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
		driver.switchTo().frame(frameElement2);
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.cssSelector("#container"))));	
		driver.findElement(By.cssSelector(".haAclf"));
		driver.switchTo().parentFrame();
			
		driver.findElement(By.cssSelector("#name"));
		driver.findElement(By.cssSelector("#email"));
		driver.findElement(By.cssSelector("#password"));
		driver.findElement(By.cssSelector("#mobileNumber"));
		driver.findElement(By.cssSelector("#signup-btn"));
		driver.findElement(By.cssSelector(".iti__flag-container"));
		driver.findElement(By.cssSelector("#togglePassword"));
		driver.findElement(By.cssSelector("p>a"));
		
		driver.findElement(By.cssSelector("#password"));
		driver.findElement(By.cssSelector("#mobileNumber"));
		driver.findElement(By.cssSelector("#signup-btn"));
		driver.findElement(By.cssSelector(".iti__flag-container"));
		driver.findElement(By.cssSelector("#togglePassword"));
		
		driver.quit();
	}
	public static void main(String[] args) {
		Locators obj = new Locators();
		obj.launchSite();

	}

}
