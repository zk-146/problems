package arrays;

import java.util.Scanner;

public class Intersections {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int cases = sc.nextInt();
		
		int numOfElements = sc.nextInt();
		
		int[] arr1 = new int[numOfElements];
		for(int i = 0; i < numOfElements; i++) {
			arr1[i] = sc.nextInt();
		}
		numOfElements = sc.nextInt();
		
		int[] arr2 = new int[numOfElements];
		for(int i = 0; i < numOfElements; i++) {
			arr2[i] = sc.nextInt();
		}
		intersections(arr1, arr2);
	}
	public static void intersections(int arr1[], int arr2[]) {
		int[] intersection = new int[arr1.length + arr2.length];
		
		for(int i = 0; i <intersection.length; i++)
			intersection[i] = -1;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					intersection[i] = arr1[i];
					arr2[j] = -1;
					break;
				}
			}
		}

		for (int i = 0; i < intersection.length; i++) {
			if (intersection[i] != -1)
				System.out.print(intersection[i] + " ");
		}
	}
}
