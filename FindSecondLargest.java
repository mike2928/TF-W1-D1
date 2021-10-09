package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,16,4,6,12};
		Arrays.sort(data);
		int length = data.length;
		
		System.out.println("The Second largest Number is " + data[length - 2]);

	}

}
