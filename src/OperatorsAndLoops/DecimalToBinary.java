package OperatorsAndLoops;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int num = 0;
		String res = "";

		while (n > 0) {
			num = n % 2;
			res = num + res;
			n /= 2;
		}
		System.out.println(res);
	}
}
