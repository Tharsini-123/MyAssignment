package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxRange = 10;
		System.out.print("odd number from 1 to 10 is : ");
		
		for (int i=1;i<=maxRange; i++) {
			if(i%2==1) {
				System.out.print(i + " ");
			}
		}

	}

}
