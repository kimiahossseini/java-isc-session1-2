package ir.isc.training;
import java.util.Arrays;
public class arraylist {
	public static void main(String[] args) {
		int[] numbers = {5, 2, 8, 1, 3};
		Arrays.sort(numbers); // Automatically sorts in ascending order
		System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 3, 5, 8]
		
		int[] numbers0 = {1, 2, 3, 4, 5};
		int target = 3;
		int index = Arrays.binarySearch(numbers0, target); // Requires sorted array
		System.out.println("Found at index: " + index); // Output: Found at index: 2

		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3};
		boolean areEqual = Arrays.equals(arr1, arr2); // True if elements and order are identical
		System.out.println("Arrays are equal: " + areEqual); // Output: Arrays are equal: true

		int[] numbers1 = {1, 2, 3, 4};
		System.out.println(Arrays.toString(numbers1)); // Output: [1, 2, 3, 4]

		int[] numbers2 = new int[5];
		Arrays.fill(numbers2, 10); // Fills all elements with 10
		System.out.println(Arrays.toString(numbers2)); // Output: [10, 10, 10, 10, 10]

		int[] original = {1, 2, 3, 4, 5};
		int[] copy = Arrays.copyOf(original, original.length); // Copies entire array
		System.out.println(Arrays.toString(copy)); // Output: [1, 2, 3, 4, 5]

	}

}
