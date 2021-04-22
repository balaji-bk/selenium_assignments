package week2.assigment;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args)
	{
		//lunch
		System.setProperty("webdriver.chrome.driver","D:/org.testleaf/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("n");
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
		
		WebElement con = driver.findElement(By.linkText("Contacts"));
		con.click();
		
		
		WebElement cc = driver.findElement(By.linkText("Create Contact"));
		cc.click();
		
		
		WebElement firstname = driver.findElement(By.id("firstNameField"));
		firstname.sendKeys("BK");
		
		WebElement lastname = driver.findElement(By.id("lastNameField"));
		lastname.sendKeys("bala");
		
		WebElement firstnamel = driver.findElement(By.id("createContactForm_firstNameLocal"));
		firstnamel.sendKeys("BK");
		
		WebElement lastnamel = driver.findElement(By.id("createContactForm_lastNameLocal"));
		lastnamel.sendKeys("bala");
		
		WebElement dep = driver.findElement(By.id("createContactForm_departmentName"));
		dep.sendKeys("Computer Science");
		
		
		WebElement des = driver.findElement(By.id("createContactForm_description"));
		des.click();
		
		des.sendKeys("HAI I'M BALA");
		
		WebElement email = driver.findElement(By.id("createContactForm_primaryEmail"));
		email.sendKeys("bala28@gmail.com");
		
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select sel = new Select(state);
		sel.selectByVisibleText("New York");
		
		WebElement cu = driver.findElement(By.name("submitButton"));
		cu.click();
		
		WebElement edit = driver.findElement(By.linkText("Edit"));
		edit.click();
		
		WebElement des1 = driver.findElement(By.name("description"));
		//des1.click();
		des1.clear();
		
		
		WebElement imp = driver.findElement(By.id("updateContactForm_importantNote"));
		imp.click();
		imp.sendKeys("important");
		
		WebElement up = driver.findElement(By.xpath("//input[@name='submitButton']"));
		up.click(); 
		
		
		
		
		System.out.println("PAGE TITLE:"+driver.getTitle());
		
		driver.close();
		
	}

}
