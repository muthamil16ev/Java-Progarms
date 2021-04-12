package PatternPrograms;

public class ChristmasTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int k = 1; k <= 3; k++) {
			for (int i =2; i <= n; i++) {
				for (int j = 1; j <= n - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
		}
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 2; j++) {
				if (j <= 1) {
					System.out.print("    *");
				} else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}
