package week2.day2;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

	public static void main(String[] args) {
		//instantiate chrome
		ChromeDriver driver=new ChromeDriver();
		//maximise the browser
		driver.manage().window().maximize();
		//get the url
		driver.get("https://www.facebook.com");
		//enter the username
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mahi.arul@yahoo.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Password1");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.findElement(By.name("login")).click();
		
	

	}

}
