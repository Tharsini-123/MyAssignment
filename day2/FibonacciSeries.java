package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputRange = 8;
		System.out.print("Fibonacciseries upto 8 range is :");
		
		fibonacci(inputRange);
				
	}

	public static void fibonacci(int inputRange) {
		// TODO Auto-generated method stub
		
		int a = 0; int b =1;
		
		for(int i=1;i<=inputRange;i++) {
			System.out.print(a + " ");
			int c = a+b;
			a=b;
			b=c;
		}
		
	}

}
