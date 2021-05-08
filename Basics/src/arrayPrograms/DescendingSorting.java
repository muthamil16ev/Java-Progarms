package arrayPrograms;

public class DescendingSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 8, 7, 1, 4, 5, 9, 3, 2, 6 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}System.out.println(a[i]);
		}
	}

}
