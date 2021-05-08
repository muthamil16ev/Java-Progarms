package patternPrograms;

public class LoveHorizontal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j==1||i==n){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}System.out.print("  ");
			for (int j = 1; j <= n; j++) {
				if(i==1||j==1||i==n||j==n){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <=n*2; j++) {
				if(j==i||i+j==n*2){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}}
				System.out.print("  ");
			for (int j = 1; j <= n; j++) {
				if(i==1||i==n/2+1||i==n||j==1){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
