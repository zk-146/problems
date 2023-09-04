package OperatorsAndLoops;

import java.util.Scanner;

public class NPrimeNos {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n >= 1) {
			System.out.println(2);
		}
		int i = 3;
		while (i <= n) {
			if (i % 2 == 0) {
				i++;
				continue;
			}
			boolean prime = true;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0 && j != i) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.println(i);
			}
			i++;
		}

	}
}
