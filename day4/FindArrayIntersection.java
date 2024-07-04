package week2.day4;

import java.util.Arrays;
import java.util.Iterator;

public class FindArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[]={3,2,11,4,6,7};
		int array2[]={1,2,8,4,9,7};
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		System.out.println("same number between two arrays are : ");
		//iterate array1 
		for(int i = 0; i < array1.length; i++) {
			
			//iterate array2
			for (int j = 0; j < array2.length; j++) {
				
				if(array1[i]==array2[j]) {
					System.out.println(array1[i]);
				}
			}
			
		}

	}

}
