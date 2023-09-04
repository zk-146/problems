package arrays;

public class Unique {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 1, 3, 6, 6, 7, 10, 7 };

		int[] unique = arr;

		for (int i = 0; i < arr.length; i++) {
			int find = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (j == i)
					continue;
				if (find == arr[j]) {
					unique[i] = -1;
					unique[j] = -1;
				}
			}
		}
		for (int i = 0; i < unique.length; i++) {
			if (unique[i] != -1) {
				System.out.println(unique[i]);
			}
		}
	}
}
