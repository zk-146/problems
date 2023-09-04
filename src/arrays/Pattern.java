package arrays;

public class Pattern {
	public static void main(String[] args) {
		int n = 4;
		int i = 0;

		while (i < n) {
			int j = 0;
			while (j <= i) {
				System.out.print((char)('A'+i));
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
