package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

		public static void main(String[] args) {
			// activate the browser
			ChromeDriver driver= new ChromeDriver();
		
			
			//Maximize the window
			driver.manage().window().maximize();
			//load the url 
			driver.get("http://leaftaps.com/opentaps/control/main");
			//enter the username
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			//enter the password
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			// clickon login button
			driver.findElement(By.className("decorativeSubmit")).click();
			//click on the CRM/SFA link
			driver.findElement(By.partialLinkText("SFA")).click();
			//click on the create lead
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			//Enter mandatory Fields
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("MahiUmaP");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("UmaP");
			//sourceDD
			WebElement SourceDD = driver.findElement(By.id("createLeadForm_SourceId"));
			Select Options = new Select(SourceDD);
			Options.selectByIndex(4);
			
			
			
				
			
			
	}

}
