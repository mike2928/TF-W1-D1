package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
	
		
		char[] ctest = test.toCharArray();
		
		for (int i = 0; i < ctest.length; i++) {
			
				if(Character.isDigit(test.charAt(i))) {
				num = num +1;
				}
				
				else if(Character.isLetter(test.charAt(i))) {
				letter = letter+1;
				}
				
				else if(Character.isSpaceChar(test.charAt(i))) {
				space = space +1;
				}
				
				else {
				specialChar = specialChar + 1;
							
			}	
				
		}
		
		
		System.out.println("Total Number of Charcters: " + ctest.length);
		System.out.println("Number of Letters: " + letter);
		System.out.println("Number of Space: " + space);
		System.out.println("Number of Numericals: " + num);
		System.out.println("Number of Special Charcters: " + specialChar);
				
}
		}
	

