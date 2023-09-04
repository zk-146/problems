package arrays;

public class Merge2SortedArrays {
	public static int[] merge(int[] arr1, int[] arr2) {
		 int[] merged = new int[arr1.length+arr2.length];

	        int i = 0;
	        int j = 0;
	        int k = 0;
	        while(i < arr1.length && j < arr2.length) {
	        	System.out.println("arr1[i]: " + arr1[i] + " " + "arr2[j]: " + arr2[j] );
	            if(arr1[i] <= arr2[j]) {
	                merged[k] = arr1[i];
	                i++;
	            } else if (arr2[j] < arr1[i]) {
	                merged[k] = arr2[j];
	                j++;
	            }
	            k++;
	        }
	        while(i < arr1.length) {
	        	merged[k] = arr1[i];
	        	i++;
	        	k++;
	        }
	        while(j < arr2.length) {
	        	merged[k] = arr2[j];
	        	j++;
	        	k++;
	        }
	        return merged;
	}
	
	public static void main(String[] args) {
		int[] arr1 = { };
		int[] arr2 = { 2, 6, 9, 12};
		int[] mergedArray = merge(arr1, arr2);

		for (int i = 0; i < mergedArray.length; i++) {
			System.out.println(mergedArray[i]);
		}

	}

}
