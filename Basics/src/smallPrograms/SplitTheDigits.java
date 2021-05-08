package smallPrograms;

public class SplitTheDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 174;
		int split = 0;
		while (num != 0) {
			split = num % 10;
			System.out.println(split);
			num = num / 10;
		}
	}

}
