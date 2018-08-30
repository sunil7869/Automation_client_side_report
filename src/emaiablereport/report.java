package emaiablereport;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class report
{
	 private WebDriver driver;
	@ Test
	 public void login_page() throws InterruptedException
	 {
			System.setProperty("webdriver.chrome.driver", "D:\\seleniumJar\\chromedriver.exe");
	         WebDriver driver=new ChromeDriver();
	         
			 //Launch the Online Store Website
			 driver.get("https://dev.grab.in/");
			 
			 //Maximize window
			 driver.manage().window().maximize();
			// Enter UserName
			 driver.findElement(By.name("username")).sendKeys("suniltest");
			 // Enter Password
			 driver.findElement(By.name("password")).sendKeys("Grab@789");  //Grab@7869
			// Wait For Page To Load
			 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			 
			 driver.findElement(By.xpath(".//*[@id='m_login_signin_submit']")).click();
			 Thread.sleep(1000);
	 }
	   
	  @ Test  
	   public void add_order() throws InterruptedException
	   {   
		  driver = null;
	 		for(int i=1;i<=1;i++)
	 		{
	 		   driver.findElement(By.id("areaId")).sendKeys("Andheri West");
	 		
	 		   Select dropnew=new Select(driver.findElement(By.id("restaurantId")));
	 		
	 		   dropnew.selectByVisibleText("Suniltest");
	 		//dropnew.selectByIndex(1);
	 		
	 		   Random rand = new Random();
	 	       int num = rand.nextInt(9000000) + 1000000;
	 		
	 		   //String uuid = UUID.randomUUID().toString();
	 	
			    driver.findElement(By.id("billNo")).sendKeys(""+num);
			    driver.findElement(By.id("orderAmount")).sendKeys("55");
			    driver.findElement(By.id("customerPhone")).sendKeys("8286682623");
			    
			    Thread.sleep(1000);

			     //delivery years
		 		
		       Select dropndelivery=new Select(driver.findElement(By.id("deliveryArea")));
		 		
		        dropndelivery.selectByVisibleText("4 Bunglows");
		 	    //dropndelivery.selectByIndex(1);
			 
			    driver.findElement(By.id("customerName")).sendKeys("Sunil Yadav");
			    driver.findElement(By.id("customerAddress")).sendKeys("Laxmi Plaza new link road goregaon west");
			 
		 	    driver.findElement(By.xpath("//*[@id=\"placeordrBtn\"]")).click();
		 	   Thread.sleep(1000);
	 		}
		   
	   }
	  
	  @ Test 
	   public void chart_report()
	   {
		   System.out.println("hello2");
	   }
	  @ Test 
	   public void feedback()
	   {
		   System.out.println("hello2");
	   }
	  @ Test 
	   public void order_history()
	   {
		   System.out.println("hello2");

	   }
	  @ Test 
	   public void api_configuration()
	   {
		   System.out.println("hello2");

	   }
	  @ Test 
	   public void wallet_transaction()
	   {
		   System.out.println("hello2");
  
	   }
	  @ Test 
	   public void user()
	   {
		   System.out.println("hello2");

	   }
	  @ Test 
	   public void live_feed()
	   {
		   System.out.println("hello2");

	   }
	  @ Test 
	   public void todays_order()
	   {
		   System.out.println("hello2");

	   }
	  @ Test 
	   public void add_lead()
	   {
		   System.out.println("hello2");

	   }
	  @ Test 
	   public void wallet_reachage()
	   {
		   System.out.println("hello2");

	   }
	  @ Test 
	   public void hold_unhold()
	   {
		   System.out.println("hello2");

	   }
	  @ Test 
	   public void esclation()
	   {
		   System.out.println("hello2");

	   }

}
