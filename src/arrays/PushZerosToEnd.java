package arrays;

public class PushZerosToEnd {
	public static void pushZeros(int[] arr) {
		int n = arr.length;

		int zeroCount = 0; 
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                arr[zeroCount++] = arr[i]; 
        }
        while (zeroCount < n) {
        	arr[zeroCount++] = 0;
        }
	}
	
	public static void main(String[] args) {
		int[] arr = { 0, 2, 0, 6, 9, 12};
		pushZeros(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
