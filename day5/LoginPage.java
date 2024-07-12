package week3.day5;

public class LoginPage extends BasePage{
	
	public static void main(String[] agrs) {
		LoginPage obj = new LoginPage();
		
		obj.findElement();
		obj.clickElement();
		obj.enterText();
		obj.performCommonTasks();
	}
	
	public void performCommonTasks() {
		System.out.println("performCommonTasks in LoginPage");
	}
	


}
