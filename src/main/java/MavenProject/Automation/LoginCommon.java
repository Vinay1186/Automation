package MavenProject.Automation;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
 

public class LoginCommon 

{
	ChromeDriver driver;
     
	@BeforeTest
	public void Login() throws InterruptedException
	{
		 ChromeOptions options = new ChromeOptions();
		 HashMap <Object, Object>   prefs  = new HashMap<>();
		 prefs.put("credentials_enable_service", false);
		 prefs.put("profile.password_manager", false);
		 prefs.put("profile.password_manager_leak_detection", false);
	     options.setExperimentalOption("prefs",prefs);
	    driver = new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement username=   driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("visual_user");	
		WebElement password=          driver.findElement(By.xpath("//input[@placeholder='Password']"));
	    password.sendKeys("secret_sauce");
	    driver.findElement(By.id("login-button")).click();  
	}
	
	@AfterTest
	public void Quit() throws InterruptedException
	{
		
		driver.quit();
	}
	
	
}
