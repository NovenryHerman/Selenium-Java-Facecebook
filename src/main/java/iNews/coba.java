
package iNews;

import org.openqa.selenium.By.ById;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.jodah.failsafe.internal.util.Assert;

public class coba 
{
	public static WebDriver driver;
	
    public static void main( String[] args ) throws InterruptedException
    {
		
		
		  
		  ChromeOptions options = new ChromeOptions();
		  options.addArguments("disable-notifications");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\novenry.herman\\Documents\\09Selenium\\chromedriver.exe"); 
		  driver = new ChromeDriver(options);
		  
		  driver.get("https://www.facebook.com/");
		  
			
			  //ini untuk membesarkan teb web yang muncul
			  driver.manage().window().maximize();
			  
			  Thread.sleep(5000);
			  
			  driver.findElement(By.id("email")).sendKeys("novendrih@yahoo.co.id");
			  
			  
			  driver.findElement(By.id("pass")).sendKeys("p123456789");
			  
			  Thread.sleep(5000);
			 
		  //driver.findElement(By.id("u_0_d_lt")).click();
		  
			
			
			//ketika memanggil fungsi buttonnya tidak bisa memakai id atau path masih banya cara by. lalu tekan Ctrl(spasi) contoh "name" di bawah 
		  //untuk memanggil tombol login yg ada di FB
			  WebElement p = driver.findElement(By.name("login"));
			  p.click();
			 
			  String Nvn = driver.getCurrentUrl();
			  String her = "https://www.facebook.com/";
			 
			  
			 // driver.navigate().to("https://www.facebook.com/");
			  assertEquals("5Adult",driver.findElement(ById("email")).getText());
				
			  
			  
			  
			 driver.close();
		  
		  
			/*
			 * String userEmail = "novendrih@yahoo.co.id"; String userPassword =
			 * "p123456789";
			 */
		 
		 
			/*
			 * int mynum = (15); System.out.println(mynum);
			 */
    	
    
    
    }

	private static void assertEquals(String string, String text) {
		// TODO Auto-generated method stub
		
	}

	private static By ById(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
