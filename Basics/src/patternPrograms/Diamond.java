package patternPrograms;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 1; i <= n * 2 - 1; i++) {
			if (i <= n) {
				for (int j = i; j <= n - 1; j++) {
					System.out.print("  ");
				}
				for (int k = 1; k <= 2 * i - 1; k++) {
					System.out.print("* ");
				}
			} else {
				for (int j = 1; j <= i - n; j++) {
					System.out.print("  ");
				}
				for (int k = i - n; k <= 2 * (n - 1) - (i - n); k++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
