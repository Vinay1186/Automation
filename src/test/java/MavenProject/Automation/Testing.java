package MavenProject.Automation;
 
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testing extends LoginCommon
{
     @Test
     public void OpenCart() throws InterruptedException  
     {
    	 driver.findElement(By.xpath("//div[text()= 'Sauce Labs Backpack']")).click();
    	 driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
    	 //Thread.sleep(1000);
    	 driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
    	 driver.findElement(By.xpath("//button[text()='Checkout']")).click();  
         WebElement fn=	 driver.findElement(By.xpath("//input[@placeholder='First Name']"));
         fn.sendKeys("Vijay");
         WebElement ln=	 driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
         ln.sendKeys("Patel");
         WebElement pc=	 driver.findElement(By.id("postal-code"));
         pc.sendKeys("400055");
         driver.findElement(By.xpath("//input[@type='submit']")).click();
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0, 150)");
         /*Actions actions = new Actions(driver);
         actions.moveToElement(0, 0).perform();*/
         driver.findElement(By.xpath("//button[text()='Finish']")).click();
         driver.findElement(By.xpath("//button[text()='Back Home']")).click();
         driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
         driver.findElement(By.xpath("//a[text()='Logout']")).click();
         Thread.sleep(2000);
     }
	 

}
