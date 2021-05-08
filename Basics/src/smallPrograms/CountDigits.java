package smallPrograms;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 174;
		int count = 0;
		while (num != 0) {
			count=count+1;
			num = num / 10;
		}
		System.out.println(count);
	}

}
