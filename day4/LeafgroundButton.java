package week2.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class LeafgroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following-sibling::button")).click();
		//Verify that the title of the page is ‘dashboard
		String title = driver.getTitle();
		if(title.equals("dashboard")) {
			System.out.println("titel is : " + title);
		}else {
			System.out.println(title);
		}
		
		
		driver.navigate().back();
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled
		boolean confirmBtn = driver.findElement(By.xpath(("//h5[text()='Confirm if the button is disabled.']/following::button"))).isEnabled();
		if(confirmBtn==true) {
			System.out.println("'Confirm if the button is disabled' : ------is not disabled------"+ confirmBtn);
		}else {
			System.out.println("'Confirm if the button is disabled' : yes, isEnabled() value is :"+ confirmBtn);
		}
		
		//Find and print the position of the button with the text ‘Submit.’
		Point submitlocation = driver.findElement(By.xpath("//span[text()='Submit']/..")).getLocation();
		System.out.println(submitlocation);
		
		//Find and print the background color of the button with the text ‘Find the Save button color.’
		String cssValueBckClr = driver.findElement(By.xpath("//h5[text()='Find the Save button color']/following::button")).getCssValue("background-color");
		System.out.println(cssValueBckClr);
		
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		Dimension size = driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']/following::button")).getSize();
		int buttonheight = size.getHeight();
		int buttonwidth = size.getWidth();
		System.out.println("Height : " + buttonheight + "width : " + buttonwidth);
		
		driver.close();

	}

}
