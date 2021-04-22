package week2.assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateContact {

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
		System.out.println("clicked");

		WebElement lead = driver.findElement(By.linkText("Leads"));
		lead.click();
		
		WebElement findlead =driver.findElement(By.linkText("Find Leads"));
		findlead.click();

		WebElement email = driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]"));
		email.click();
		
		WebElement emailad = driver.findElement(By.name("emailAddress"));
		emailad.click();
		emailad.sendKeys("abc@gmail.com");
		
		
		WebElement fl =driver.findElement(By.xpath("//button[text()='Find Leads']"));
		fl.click();
		System.out.println("find leads clicked");
		
		Thread.sleep(1000);
//		WebElement flg = driver.findElement(By.xpath("//a[@id='ext-gen933']"));
		WebElement flg = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a"));
		String name = flg.getText();
		System.out.println("passing name:"+name);
		flg.click();
		
		
		System.out.println("cle");
		
		
		WebElement dupl = driver.findElement(By.linkText("Duplicate Lead"));
		dupl.click();
		
		WebElement cl = driver.findElement(By.name("submitButton"));
		cl.click();
		
		WebElement gn =driver.findElement(By.id("viewLead_firstName_sp"));
		String rname = gn.getText();
		System.out.println("received Name:"+rname);
		
			if(name == rname)
			{
				System.out.println("names are same");
			}
			else
			{
				System.out.println("names are not same");
			}
		
		
		//driver.close();

		
	}

}
