package week2.day4;

import java.util.Arrays;

public class MissingElementOnArray {
	
	public static void main(String[] args) {
		int input[] = {1, 4,3,2,8, 6, 7};
		
		Arrays.sort(input); //{1,2,3,4,6,7,8}
		
		//find maximum is given array
		int max = input[0];
		for (int i = 0; i < input.length; i++) {  
            //Compare elements of array with max
           if(input[i] > max) {  
               max = input[i];
           }
        }
		//System.out.println(max);
		
		//sum of all given numbers
		int sum=0;
		for(int j=0; j<input.length; j++) {
			sum=sum+input[j];
		}
		//System.out.println(sum);
		
		//find missing element in the array
		int missingnum = (max*(max+1)/2) - sum;
		System.out.println(missingnum + " is the missig element in the array");
		
	}

}
