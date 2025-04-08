package MavenProject.Automation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Automation1 {

	 
		  @Test
		  void test1() throws InterruptedException
		  {
			  ChromeDriver driver=new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D674893540034%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D10043021606720327450%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9301330%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2316413%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			  driver.manage().window().maximize();
			  //Thread.sleep(2000);
			  WebElement username=   driver.findElement(By.xpath("//input[@name='email']"));
			  username.sendKeys("mahektripathi221989@gmail.com");
			  Assertion a1=new Assertion();
			  a1.assertEquals("mahektripathi221989@gmail.com", "mahektripathi221989@gmail.com");	   
		  }
 
	 
}
