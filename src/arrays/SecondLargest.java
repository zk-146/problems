package arrays;

public class SecondLargest {
	public static int secondLargest(int[] arr) {
		int n = arr.length;
		if (n == 0)
			return 0;

		int max = arr[n - 1];
		int max2 = arr[0];

		int maxIdx = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] >= max) {
				max = arr[i];
				maxIdx = i;
			}
		}
		for (int i = 0; i < n; i++) {
			if (maxIdx != i && arr[i] < max && arr[i] > max2) {
				max2 = arr[i];
			}
		}

		return max2;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 4, 3, 6, 7, 66 };
		int max2 = secondLargest(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("max 2: " + max2);

	}

}
