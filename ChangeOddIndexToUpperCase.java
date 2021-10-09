package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] ctest = test.toCharArray();
		
		for (int i = 0; i < ctest.length; i++) {
			
			if(i%2 == 0) {
				
				ctest[i] = Character.toUpperCase(ctest[i]);
				
			}		
			System.out.println(ctest[i]);
		
			}
			
		}
				
	}
