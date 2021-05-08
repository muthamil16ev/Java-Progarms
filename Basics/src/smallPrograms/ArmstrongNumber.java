package smallPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		int check = n;
		int r = 0;
		while (n != 0) {
			int rem = n % 10;
			r = r + (rem * rem * rem);
			n = n / 10;
		}
		if (check == r) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not an Armstrong number");
		}
	}

}
