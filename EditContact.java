package week2.assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditContact {

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

		WebElement fn = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		fn.sendKeys("sri");
		
		WebElement fl =  driver.findElement(By.xpath("//button[text()='Find Leads']"));
		fl.click();
		
		System.out.println("TITLE PAGE "+driver.getTitle());
		
		Thread.sleep(1000);
		WebElement sri = driver.findElement(By.linkText("10150"));
		sri.click();
		
		
		
		WebElement edit = driver.findElement(By.linkText("Edit"));
		edit.click();
		
		WebElement ch = driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
		ch.clear();
		ch.sendKeys("test leaf2");
		
		System.out.println(ch);
		
		
		WebElement update = driver.findElement(By.xpath("//input[@name='submitButton']"));
		update.click();
		
		WebElement uch = driver.findElement(By.id("viewLead_companyName_sp"));
		System.out.println(uch.getText());
		
		if (ch == uch)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
		
		driver.close();
		}
		
		
 	}


