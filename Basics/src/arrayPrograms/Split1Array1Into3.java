package arrayPrograms;

public class Split1Array1Into3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 7, 5, 4, 3, 1, 11, 13, 0, 9, 7,4};
		int rem=a.length%3;
		//if (a.length % 3 == 0) {
			int x[] = new int[a.length / 3+rem];
			int y[] = new int[a.length / 3];
			int z[] = new int[a.length / 3];
			for (int i = 0; i < x.length; i++) {
				x[i] = a[i];
				System.out.print(x[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < y.length; i++) {
				y[i] = a[x.length + i];
				System.out.print(y[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < z.length; i++) {
				z[i] = a[x.length + y.length + i];
				System.out.print(z[i] + " ");
			}
		 /* } else {
			if (a.length % 3 == 1) {
				int x[] = new int[a.length / 3 + 1];
				int y[] = new int[a.length / 3];
				int z[] = new int[a.length / 3];
				for (int i = 0; i < x.length; i++) {
					x[i] = a[i];
					System.out.print(x[i] + " ");
				}
				System.out.println();
				for (int i = 0; i < y.length; i++) {
					y[i] = a[x.length + i];
					System.out.print(y[i] + " ");
				}
				System.out.println();
				for (int i = 0; i < z.length; i++) {
					z[i] = a[x.length + y.length + i];
					System.out.print(z[i] + " ");
				}
			} else {
				int x[] = new int[a.length / 3 + 1];
				int y[] = new int[a.length / 3 + 1];
				int z[] = new int[a.length / 3];
				for (int i = 0; i < x.length; i++) {
					x[i] = a[i];
					System.out.print(x[i] + " ");
				}
				System.out.println();
				for (int i = 0; i < y.length; i++) {
					y[i] = a[x.length + i];
					System.out.print(y[i] + " ");
				}
				System.out.println();
				for (int i = 0; i < z.length; i++) {
					z[i] = a[x.length + y.length + i];
					System.out.print(z[i] + " ");
				}
			}
		}*/
	}
}
