package arrays;

import java.util.Scanner;

public class Sort01 {

	public static void sortZeroesAndOne(int[] arr, int target) {
		int n = arr.length;
		int zeroIndex = 0;
		
		for (int i = 0; i < n; i++)
			if (arr[i] == 0) {
				int temp = arr[zeroIndex];
				arr[zeroIndex] = arr[i];
				arr[i] = temp;
				zeroIndex += 1;
			}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 0, 0, 1, 0, 1, 0, 0, 1, 0 };
//		int[] arr = { 8, 9, 9, 1, 7, 5, 5, 10, 0, 1, 7 };
		sortZeroesAndOne(arr, 45);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
