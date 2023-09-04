package arrays;

public class RotateArray {
	public static void pushZeros(int[] arr, int d) {
		int n = arr.length;

	    int k = 0;
		int temp[] = new int[n];
	 
	    for (int i = d; i < n; i++) {
	        temp[k] = arr[i];
	        k++;
	    }
	 
	    for (int i = 0; i < d; i++) {
	        temp[k] = arr[i];
	        k++;
	    }
	 
	    for (int i = 0; i < n; i++) {
	        arr[i] = temp[i];
	    }
	}
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6};
		pushZeros(arr, 3);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
