package patternPrograms;

public class BPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5,b=6;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (i == 1||i==3||j==1||j==5||i==5) {
					System.out.print("* ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
