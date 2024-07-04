package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountAndVerifyTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		//enter credentials and login
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
		//"CRM/SFA link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//go to Accounts tab
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/accountsMain']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		//enter data in accounts tab
		driver.findElement(By.id("accountName")).sendKeys("Priyatharsini");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("3");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		// click on create account
		driver.findElement(By.className("smallSubmit")).click();
		
		//get title and verify
		String title= driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(7000);
		
		driver.close();

	}

}
