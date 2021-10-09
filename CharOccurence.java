package week1.day2;

public class CharOccurence {

	public static void main(String[] args) {
		
		int count = 0;
		String str1 = "prince michale renald";
		char[] charArray = str1.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'e') {
				count++;
			}
		}
		System.out.println("The Number of Occurence is " + count);
	}

}
