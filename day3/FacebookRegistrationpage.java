package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistrationpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		Thread.sleep(7000);
		driver.findElement(By.name("firstname")).sendKeys("Priya");
		driver.findElement(By.name("lastname")).sendKeys("N");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Pwd123");
		
		Select dayObj = new Select(driver.findElement(By.id("day")));
		dayObj.selectByIndex(18);
		
		Select monthObj = new Select(driver.findElement(By.id("month")));
		monthObj.selectByValue("6");
		
		Select yearObj = new Select(driver.findElement(By.id("year")));
		yearObj.selectByValue("2022");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}
