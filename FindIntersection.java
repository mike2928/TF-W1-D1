package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr1 = { 3, 5, 11, 4, 6, 7 };
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };

		//Arrays.sort(arr1);
		//Arrays.sort(arr2);

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i] + " is a Intersection Value");
				}

			}

		}

	}
}
