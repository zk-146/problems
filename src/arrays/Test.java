package arrays;

public class Test {

	public static void main(String[] args) {
		int[] arr1 = { 6, 9, 8, 5 };
		int[] arr2 = {};
		String num1 = "0";
		String num2 = "0";

		for (int i = 0; i < arr1.length; i++) {
			num1 += arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			num2 += arr2[i];
		}

		int res = Integer.parseInt(num1) + Integer.parseInt(num2);
		int[] output = new int[4];
		for (int i = output.length - 1; i >= 0; i--) {
			if (res <= 0)
				break;
			if (res <= 9) {
				output[i] = res;
				break;
			}
			int num = res % 10;
			output[i] = num;
			res /= 10;
		}

		for (int i = 0; i < output.length; i++)
			System.out.print(output[i]);

	}

}
