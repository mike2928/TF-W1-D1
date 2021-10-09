package week1.day2;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		
		String Input="noon";
		String rev="";
			
		for (int i = Input.length() -1; i >= 0 ; i--) {
			
		rev = rev + Input.charAt(i);
			
		}
		
		char[] text1 = Input.toCharArray();
		char[] text2 = rev.toCharArray();
		
		
		if (Arrays.equals(text1,text2)) {
			
			System.out.println("It is a Palindrome");
			
		} else {
			
			System.out.println("It is not a Palindrome");

		}
		
		}
	}
