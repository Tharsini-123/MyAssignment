package week3.day5;

public class Button extends WebElement{
	
	public void submit() {
		System.out.println("submit() in Button class");
	}
	
	public static void main(String[] args) {
		Button buttonObj = new Button();
		buttonObj.click();
		buttonObj.setText("Button text");
		buttonObj.submit();
	}

}
