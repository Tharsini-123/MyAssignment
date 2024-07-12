package week3.day5;

public class RemoveDuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn Java basics as part of java sessions in java week1";
		int count = 0;
		String[] textSplit = text.split(" ");
		for(int i=0 ; i <textSplit.length; i ++) {
			
			count = 1;
			for(int j=i+1; j < textSplit.length; j ++) {
				
				if(textSplit[i].equalsIgnoreCase(textSplit[j])) {
					textSplit[j] = " ";
					count++;
				}
			}
			System.out.print(textSplit[i] + " ");
			 
			/*
			 * if(count>1) { for(int k =0;k<textSplit.length; k ++) {
			 * System.out.println(textSplit[i]); } }
			 */
		}
		
	}

}
