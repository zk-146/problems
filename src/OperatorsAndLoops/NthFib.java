package OperatorsAndLoops;

import java.util.Scanner;

public class NthFib {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int f0 = 0;
		int f1 = 1;

		int fn = 0;

		for (int i = 0; i < n; i++) {
			f0 = f1;
			f1 = fn;
			fn = f0 + f1;
		}

		System.out.println(fn);

	}
}
