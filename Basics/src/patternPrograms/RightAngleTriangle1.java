package patternPrograms;

public class RightAngleTriangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = n; i >= 1; i--) {
			for(int j=1;j<=i-1;j++){
				System.out.print("  ");
			}
			for(int k=0;k<=n-i;k++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
