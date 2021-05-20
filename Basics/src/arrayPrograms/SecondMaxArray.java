package arrayPrograms;

public class SecondMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 4,5,6,874,4335,5,4,456,765913,57,99,84,4336};
		int max1 = 0, max2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max1) {
				max2 = max1;
				max1 = a[i];
			} else {
				if (a[i] > max2) {
					max2 = a[i];
				}
			}
		}
		System.out.println("Second maximum Value " + max2);
	}

}
