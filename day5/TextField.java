package week3.day5;

public class TextField extends WebElement{
	
	public void getText() {
		System.out.println("getText() in TextField class");
	}
	
	public static void main(String[] args) {
		TextField textFieldObj = new TextField();
		textFieldObj.getText();
		textFieldObj.click();
	}

}
