package doubleForLoop;

public class DoubleForPerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num = 1; num <= 100000; num++) {
		int sum = 0;
			for (int i = 1; i <= num / 2; i++) {
				if (num % i == 0) {
					sum = sum + i;
				}
			}
			if (num == sum) {
				System.out.println("perfect number " + num);
			}
		}
	}

}
