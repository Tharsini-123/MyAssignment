package week3.day5;

public class ReverseOddWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";
		String[] testSplit = test.split(" ");
		String output = "";
		String revWords ="";
		
		for(int i = 0; i < testSplit.length;i++) {
			if(i%2 !=0) {
				String words = testSplit[i];
				
				  for(int j= words.length()-1; j>=0 ; j--) {
					  revWords = revWords + words.charAt(j);				  
				  }
				  output = output + revWords + " ";
				  revWords = "";
			}else {
				output = output + testSplit[i] + " ";
			}
			  
		}
		System.out.println(output);

	}

}
