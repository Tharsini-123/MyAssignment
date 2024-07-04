package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
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
		
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Google");
		driver.findElement(By.xpath("//span[text()='First name']/following::input")).sendKeys("Priyatharsini");
		driver.findElement(By.xpath("(//span[@class='requiredField']/following::input)[4]")).sendKeys("N");
		driver.findElement(By.xpath("(//input[@size='30'])[4]")).sendKeys("dhars");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Architech");
		driver.findElement(By.name("description")).sendKeys("edit lead description");
		driver.findElement(By.xpath("(//span[contains(text(),'E-Mail Address')]/following::input)[1]")).sendKeys("abc@gmail.com");
		Select state = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		state.selectByVisibleText("Kentucky");
		
		driver.findElement(By.name("submitButton")).click();
		
		//edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("user has lead rights");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		System.out.println(driver.getTitle());
		
		

	}

}
