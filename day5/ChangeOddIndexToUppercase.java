package week3.day5;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "changeme";
		char[] testCharArr = test.toCharArray();
		//String output = null;
		
		//Initialize loop from 0 to length of the array
		for (int i = 0; i<= testCharArr.length; i++) {
			
			if(i%2==1) {
				testCharArr[i] = Character.toUpperCase(testCharArr[i]);
			}
			//output = String.valueOf(testCharArr[i]);
			System.out.print(testCharArr[i]);
		}
	}

}
