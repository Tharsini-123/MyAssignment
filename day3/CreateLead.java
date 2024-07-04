package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
		//create Lead
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/createLeadForm']")).click();
		
		//Fill details
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyatharsini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TLeaf");
		driver.findElement(By.name("generalProfTitle")).sendKeys("Student");
		
		//click on 'Create Lead'
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		//verify title
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		driver.close();

	}

}
