package patternPrograms;

public class LovePatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(j==1||i==n){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1||j==1||i==n||j==n){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=n; j++) {
				if(j==i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}}
				for (int j = n-1; j>=i; j--) {
					if(j==i){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=n; j++) {
				if(i==1||i==n/2+1||i==n||j==1){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
