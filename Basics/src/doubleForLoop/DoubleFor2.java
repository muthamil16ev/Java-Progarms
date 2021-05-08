package doubleForLoop;

public class DoubleFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = i; j <= 10; j++) {
				count += 1;
				System.out.println(i + "  " + j);
			}
		}
		System.out.println("count" + count);
	}

}
