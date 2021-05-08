package arrayPrograms;

public class CheckSumOFOddAndEvenElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = { 7, 4, 5, 1, 2, 6, 9, 8, 1 };
		int AllSum = 0;
		int EvenSum = 0;
		int OddSum = 0;
		for (int i = 0; i < x.length; i++) {
			AllSum += x[i];
			if (x[i] % 2 == 0) {
				EvenSum += x[i];
			} else {
				OddSum += x[i];
			}
		}
		if(AllSum==EvenSum+OddSum){
			System.out.println("sum of odd and even elements are equal to All Elements");
		}
		else{
			System.out.println("sum of odd and even elements are not equal to All Elements");
		}
	}

}
