package arrayPrograms;

public class SplitArrayOnBasisOfOddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = { 7, 4, 5, 1, 2, 6, 9, 8, 1 };
		int countEven = 0;
		int countOdd = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				countEven += 1;
			} else {
				countOdd += 1;
			}
		}
		int a[] = new int[countEven];
		int b[] = new int[countOdd];
		int j = 0;
		int k = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				a[j] = x[i];
				j++;
			} else {
				b[k] = x[i];
				k++;
			}
		}
		System.out.println("Even Elements");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("Odd Elements");
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
