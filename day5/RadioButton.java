package week3.day5;

public class RadioButton extends Button{
	
	public void selectRadioButton() {
		System.out.println("selectRadioButton() in RadioButton class");
	}
	
	public static void main(String[] args) {
		RadioButton button = new RadioButton();
		button.selectRadioButton();
		button.click();
		button.setText("Radio button");
		button.submit();
	}

}
