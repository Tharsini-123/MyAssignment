package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionsWithCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')])[1]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')])[2]")).click();
		
		//Verify that the expected message is displayed
		
		Thread.sleep(5000);
		//Click on your favorite language
		driver.findElement(By.xpath("(//span[contains(@class,'ui-chkbox-icon ui-icon ui-c ui-icon-blank')])[3]")).click();
		
		//Click on the "Tri-State Checkbox
		driver.findElement(By.xpath("(//span[contains(@class,'ui-chkbox-icon ui-c ')])")).click();
		
		//Verify which tri-state option has been chosen
		
		//Click on the "Toggle Switch
		driver.findElement(By.xpath("(//div[contains(@class,'ui-toggleswitch-slider')])")).click();
		
		//Verify that the expected message is displayed
		
		//Verify if the Checkbox is disabled
		boolean checkboxenabled = driver.findElement(By.id("j_idt87:j_idt102_input")).isEnabled();
		System.err.println("Checkbox is enabled or disabled : " + checkboxenabled);
		
		

	}

}
