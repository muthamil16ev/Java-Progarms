package doubleForLoop;

public class DoubleFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(i + "  " + j);
				count += 1;
			}
		}
		System.out.println("count" + count);
	}
}
