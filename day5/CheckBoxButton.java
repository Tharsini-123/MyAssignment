package week3.day5;

public class CheckBoxButton extends Button{
	
	public void clickCheckButton() {
		System.out.println("clickCheckButton() in clickCheckButton class");
	}
	
	public static void main(String[] args) {
		CheckBoxButton boxButton = new CheckBoxButton();
		boxButton.clickCheckButton();
		boxButton.click();
		boxButton.setText("box button");
		boxButton.submit();
				
	}

}
