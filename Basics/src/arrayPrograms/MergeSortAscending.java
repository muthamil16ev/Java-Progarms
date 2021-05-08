package arrayPrograms;

public class MergeSortAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = { 5, 7, 3, 8, 4 };
		int y[] = { 2, 1, 12, 21, 9 };
		int z[] = { 17, 6, 10 };
		int a[] = new int[x.length + y.length + z.length];
		for (int i = 0; i < x.length; i++) {
			a[i] = x[i];
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < y.length; i++) {
			a[x.length + i] = y[i];
			System.out.print(a[x.length + i] + " ");
		}
		for (int i = 0; i < z.length; i++) {
			a[x.length + y.length + i] = z[i];
			System.out.print(a[x.length + y.length + i] + " ");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
