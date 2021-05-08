package smallPrograms;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int check = n;
		n = n * n;
		int r = 0;
		while (n != 0) {
			r = r + n % 10;
			n = n / 10;
		}
		if (check == r) {
			System.out.println("Neon number");
		} else {
			System.out.println("Not a Neon number");
		}

	}

}
