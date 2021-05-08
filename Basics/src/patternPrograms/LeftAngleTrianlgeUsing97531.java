package patternPrograms;

public class LeftAngleTrianlgeUsing97531 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 9; i > 0; i = i - 2) {
			for (int j = i-2; j > 0; j = j - 2) {
				System.out.print("  ");
			}
			for (int j = 9; j >= i; j = j - 2) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
