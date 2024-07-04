package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		
		//click on Lead tab
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		WebElement findLead = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		findLead.click();
		//driver.navigate().refresh();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement leadID = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]"));
		String leadid = leadID.getText();
		System.out.println("1st LeadId in the result is : " + leadid);
		
		Thread.sleep(8000);
		//leadID.click();
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a")).click();
		
		
		Thread.sleep(5000);
		//delete lead
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(5000);
		
		//Click find lead again
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.name("id")).sendKeys(leadid);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String message = driver.findElement(By.xpath("//div[contains(@class,'x-toolbar x-small-editor')]/div")).getText();
		if(message=="No records to display") {
			System.out.println("No records to display' came for the given leadid " +leadid);
		}
		
		driver.close();

	}

}
