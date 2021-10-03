package week1.day1;

public class NumberChecker {

	public static void main(String[] args) {
		int num = -1;
		
		if (num > 0) {
			System.out.println(num + " is a Postive Number");
		} 
		else if (num < 0) {
			System.out.println(num + " is a Negative Number");
		}
		else{
			System.out.println(num + " is neither Postive nor Negative Number");
		}
	}

}
