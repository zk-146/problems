package arrays;

import java.util.Scanner;

public class RowWiseSum {
	public static void main(String[] args) {

		int mat[][] = new int[4][4];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int[] sum = new int[mat.length];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				sum[i] += mat[i][j];
			}
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < mat.length; i++) {
			System.out.print(sum[i] + " ");
		}
	}
}
