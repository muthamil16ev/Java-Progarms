package arrayPrograms;

public class MergeRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = { 5, 7, 3, 8, 3, 1 };
		int y[] = { 2, 5, 1, 4, 21, 9 };
		int z[] = { 17, 4, 10, 12 };
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
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = 0;
				}
			}
			System.out.print(a[i]+" ");
		}
	}

}
