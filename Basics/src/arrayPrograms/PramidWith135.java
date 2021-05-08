package arrayPrograms;

public class PramidWith135 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int a=0;
		for (int i = 1; i <= n ; i++) {
				for (int j = i; j <= n - 1; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < 2*i-1; k++) {
					
					 if(k<i){
						a=i+k-1; 
					System.out.print(i+k);
					}
					 else{
						 System.out.print(a);
						 a--;
					 }
				}
			System.out.println();
		}
	}

}
