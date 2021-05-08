package patternPrograms;

public class kPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		for (int i = 1; i <= n+1; i++) {
			for (int j = 1; j <= n+1; j++) {
				if (j == 1) {
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i== j) {
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
