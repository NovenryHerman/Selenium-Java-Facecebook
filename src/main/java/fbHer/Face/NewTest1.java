package fbHer.Face;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewTest1 {
	public static WebDriver driver;
	
	public void f() throws InterruptedException {

	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\novenry.herman\\Documents\\09Selenium\\chromedriver.exe"); 
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--disalbe-notifications");
		 */
	
	 
	  driver = new ChromeDriver(); driver.get("https://www.facebook.com/");
	  
	 
	  //untuk sleep ==> driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
	  
		
		  //ini untuk membesarkan teb web yang muncul
		  driver.manage().window().maximize();
		  
		  Thread.sleep(5000);
		  
		  driver.findElement(By.id("email")).sendKeys("novendrih@yahoo.co.id");
		  Thread.sleep(5000);
		  
		  driver.findElement(By.id("pass")).sendKeys("p123456789");
		  
		  Thread.sleep(5000);
		 
	  //driver.findElement(By.id("u_0_d_lt")).click();
	  
		
		
		//ketika memanggil fungsi buttonnya tidak bisa memakai id atau path masih banya cara by. lalu tekan Ctrl(spasi) contoh "name" di bawah 
	  //untuk memanggil tombol login yg ada di FB
		  WebElement p = driver.findElement(By.name("login"));
		  p.click();
		 
		  String Nvn = driver.getCurrentUrl();
		  String her = "https://www.facebook.com/";
		  AssertJUnit.assertEquals(Nvn, her);
		 
		  //driver.get("--disalbe-notifications");
		
		  
		 // driver.navigate().to("https://www.facebook.com/");
		 // assertEquals("5Adult",driver.findElement(ById("email")).getText());
			
		 
	  
	  
		/*
		 * String userEmail = "novendrih@yahoo.co.id"; String userPassword =
		 * "p123456789";
		 */
	 
	 
		/*
		 * int mynum = (15); System.out.println(mynum);
		 */
	
		  
  
}
}