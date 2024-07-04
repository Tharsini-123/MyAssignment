package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		//select 'Your most favourite browser' radio button
		driver.findElement(By.xpath("//label[text()='Chrome'][1]")).click();
		
		//click on the same radio button again to verify that it becomes ‘unselected’
		driver.findElement(By.xpath("//label[text()='Chrome'][1]")).click();
		System.out.println("click on the same radio button again : ");
		
		boolean favBrowser = driver.findElement(By.xpath("//label[text()='Chrome'][1]")).isSelected();
		System.out.println("is chome enabled : " + favBrowser);
		
		//Identify the radio button that is initially selected by default
		String chrome = driver.findElement(By.xpath("//label[text()='Chrome'][1]")).getAttribute("checked");
		System.out.println(chrome);
		
		if(chrome=="true") {
			System.out.println("'Chrome' is the default selection in 'Your most favourite browser'");
		}else if(chrome!="true"){
			System.out.println("'Chrome' is not the default selection in 'Your most favourite browser'");
		}
		
		//Check and select the age group (21-40 Years) if not already selected
		WebElement age = driver.findElement(By.id("j_idt87:age:1"));
		String age21to40= age.getAttribute("checked");
		
		if(age21to40.equalsIgnoreCase("true")) {
			System.out.println("age group 21-40 yrs is selected by default");
		}else if(age21to40!="true") {
			//driver.findElement(By.xpath("//label[@for='j_idt87:age:1']")).click();
			driver.findElement(By.xpath("//input[@id='j_idt87:age:1']/following::div")).click();
			System.out.println("clicked age group 21-40 yrs by manually" + age21to40);
		}

	}

}
