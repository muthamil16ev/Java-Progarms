package analisesProgram;

public class doubleForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				count=count+1;
				System.out.println(i + " " + j);
			}
			for (int j = 11; j <= 20; j++) {
				count=count+1;
				System.out.println(i + " " + j);
			}
		}
		System.out.println("count "+count);
	}

}
