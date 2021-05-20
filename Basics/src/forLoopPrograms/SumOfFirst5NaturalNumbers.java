package forLoopPrograms;

public class SumOfFirst5NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of 5 Natural Numbers " + sum);
	}

}
