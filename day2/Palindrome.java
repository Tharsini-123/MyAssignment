package week1.day2;

public class Palindrome {

	static int recursive_func(int input, int rev)
    {
        if (input < 10) {
        	//System.out.println("if rev" + (rev* 10 + input));
            return rev * 10 + input;
        }
        else {
            int last_digit = input % 10;
            rev = rev * 10 + last_digit;
            //System.out.println("else rev" + rev);
            return recursive_func(input / 10, rev);
        }
    }
 
    public static void main(String[] args) {
    	int input = 59595;
        int output = recursive_func(input, 0);
 
        System.out.println("Reverse of input = " + output);
 
        if (input == output) {
            System.out.println(input + " is a Palindrome");
        }else {
            System.out.println(input + " is not a Palindrome");
        }
    }	
}
