package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeafTapAccount {

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
		
		//go to Accounts tab
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/accountsMain']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Priyatharsini");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		Select industryObj = new Select(driver.findElement(By.name("industryEnumId")));
		industryObj.selectByValue("IND_SOFTWARE");
		
		Select ownershipObj = new Select(driver.findElement(By.name("ownershipEnumId")));
		ownershipObj.selectByVisibleText("S-Corporation");
		
		Select dataObj = new Select(driver.findElement(By.id("dataSourceId")));
		dataObj.selectByValue("LEAD_EMPLOYEE");
		
		Select mrkCampnObj = new Select(driver.findElement(By.id("marketingCampaignId")));
		mrkCampnObj.selectByIndex(6);
		
		Select stateObj = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		stateObj.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();

	}

}
