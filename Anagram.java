package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String text1 = "posts";
		String text2 = "stops";
		
		if (text1.length() == text2.length()) {
			
			char[] ctext1 = text1.toCharArray();
			char[] ctext2 = text2.toCharArray();
			
			Arrays.sort(ctext1);
			Arrays.sort(ctext2);
			
			if (Arrays.equals(ctext1,ctext2)) {
				
				System.out.println("The words are a Anagram");
			}
				
			else {

				System.out.println("The words are not a Anagram");
			}
		}
			
		else {
			
			System.out.println("Not Anagram");

		}
	}
	
}

