package week3.day5;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("enterUsername in LoginTestData class");
	}
	
	public void enterPassword() {
		System.out.println("enterPassword in LoginTestData class");
	}
	
	public static void main(String[] args) {
		LoginTestData loginTestData = new LoginTestData();
		loginTestData.enterCredentials();
		loginTestData.enterUsername();
		loginTestData.enterPassword();
		
	}

}
