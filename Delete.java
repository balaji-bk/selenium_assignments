package week2.assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/org.testleaf/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/login");
		System.out.println("lanch completed");
		
		// login page
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
		WebElement lt = driver.findElement(By.linkText("CRM/SFA"));
		lt.click();
		//System.out.println("clicked");

		WebElement lead = driver.findElement(By.linkText("Leads"));
		lead.click();
		
		WebElement findlead =driver.findElement(By.linkText("Find Leads"));
		findlead.click();
		
		WebElement phone =driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]"));
		phone.click();
		
		//System.out.println("phone clicked");

		
		WebElement area =driver.findElement(By.name("phoneAreaCode"));
		area.sendKeys("876");
		
		WebElement area1 = driver.findElement(By.name("phoneNumber"));
		 area1.sendKeys("12345678");
		 
		 WebElement fl =driver.findElement(By.xpath("//button[text()='Find Leads']"));
		 fl.click();
		 //System.out.println("find leads clicked");
			
			Thread.sleep(1000);
		 WebElement fl1 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a"));
		 fl1.click();
		 
		 WebElement del =  driver.findElement(By.linkText("Delete"));
		 del.click();
		 //System.out.println("phone clicked");
		 
		 WebElement findlead1 =driver.findElement(By.linkText("Find Leads"));
			findlead1.click();
			
			WebElement phone1=driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]"));
			phone1.click();
			
			WebElement area12 =driver.findElement(By.name("phoneAreaCode"));
			area12.sendKeys("876");
			
			WebElement area11 = driver.findElement(By.name("phoneNumber"));
			 area11.sendKeys("1111");
			 
			 WebElement fl11 =driver.findElement(By.xpath("//button[text()='Find Leads']"));
			 fl11.click();
			 System.out.println("find leads clicked");
			 
			 String noRecordsTo = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
			 System.out.println(noRecordsTo);
	}

}
